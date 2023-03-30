package de.dfki.cos.basys.aas.knowledgegraph.service;

import de.dfki.cos.basys.aas.knowledgegraph.model.*;
import de.dfki.cos.basys.aas.knowledgegraph.repository.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.basyx.aas.manager.api.IAssetAdministrationShellManager;
import org.eclipse.basyx.aas.metamodel.api.IAssetAdministrationShell;
import org.eclipse.basyx.aas.metamodel.api.parts.asset.IAsset;
import org.eclipse.basyx.aas.registration.api.IAASRegistry;
import org.eclipse.basyx.aas.registry.client.api.RegistryAndDiscoveryInterfaceApi;
import org.eclipse.basyx.aas.registry.events.RegistryEvent;
import org.eclipse.basyx.aas.registry.model.*;
import org.eclipse.basyx.submodel.metamodel.api.ISubmodel;
import org.eclipse.basyx.submodel.metamodel.api.identifier.IdentifierType;
import org.eclipse.basyx.submodel.metamodel.api.reference.IKey;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.ISubmodelElement;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.ISubmodelElementCollection;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.dataelement.IBlob;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.dataelement.IFile;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.dataelement.IProperty;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.dataelement.IReferenceElement;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.event.IEvent;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.operation.IOperation;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.operation.IOperationVariable;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.relationship.IRelationshipElement;
import org.eclipse.basyx.submodel.metamodel.connected.ConnectedSubmodel;
import org.eclipse.basyx.submodel.metamodel.map.Submodel;
import org.eclipse.basyx.submodel.metamodel.map.identifier.Identifier;
import org.eclipse.basyx.vab.factory.java.ModelProxyFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.neo4j.core.Neo4jOperations;
import org.springframework.data.neo4j.core.Neo4jTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.sql.Ref;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

@Service
@Slf4j
@RequiredArgsConstructor
public class KnowledgeGraphManager {

    @Autowired
    Neo4jTemplate neo4jTemplate;

    @Autowired
    ReferableRepository referableRepository;

    @Autowired
    ReferenceRepository referenceRepository;

    @Autowired
    IdentifiableRepository identifiableRepository;

    @Autowired
    AssetAdministrationShellRepository aasRepository;

    @Autowired
    SubmodelRepository submodelRepository;

    @Autowired
    IAssetAdministrationShellManager aasManager;

    @Autowired
    IAASRegistry aasRegistry;

    @Autowired
    RegistryAndDiscoveryInterfaceApi registryAndDiscoveryInterfaceApi;

    @Autowired
    ModelProxyFactory modelProxyFactory;

    @PreDestroy
    private void cleanup() {
        neo4jTemplate.deleteAll(ReferableNode.class);
    }

    @PostConstruct
    public void bootstrapKnowledgeGraph() {
        log.info("bootstrapKnowledgeGraph - start");
        try {
            var aasDescriptors = registryAndDiscoveryInterfaceApi.getAllAssetAdministrationShellDescriptors();
            for (var aasDescriptor : aasDescriptors) {
                var aasNode = traverseAAS(aasDescriptor);
            }
            resolveReferences();
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.info("bootstrapKnowledgeGraph - finished");
    }

    @Bean
    public Consumer<RegistryEvent> aasRegistryUpdates() {
        return this::handleAasRegistryUpdates;
    }

    private void handleAasRegistryUpdates(RegistryEvent event) {
        log.info("new AAS registry event: " + event.getType());
        switch (event.getType()) {
            case AAS_REGISTERED:
                traverseAAS(event.getAasDescriptor());
                break;
            case AAS_UNREGISTERED:
                aasRepository.deleteByIdCascading(event.getId());
                break;
            case SUBMODEL_REGISTERED:
                var aasNode = aasRepository.findById(event.getId()).get();
                var submodelNode = traverseSubmodel(event.getSubmodelDescriptor());
                aasNode.getSubmodels().add(submodelNode);
                aasRepository.save(aasNode);
                break;
            case SUBMODEL_UNREGISTERED:
                submodelRepository.deleteByIdCascading(event.getSubmodelId());
                break;
            default:
                break;
        }

        resolveReferences();
    }


    private AssetAdministrationShellNode traverseAAS(AssetAdministrationShellDescriptor aasDescriptor) {
        log.info("traverseAAS {}", aasDescriptor.getIdShort());
        String id = aasDescriptor.getIdentification();
        String idShort = aasDescriptor.getIdShort();
        String endpoint = aasDescriptor.getEndpoints().get(0).getProtocolInformation().getEndpointAddress();

        IAssetAdministrationShell aas = null;

        try {
            aas = aasManager.retrieveAAS(new Identifier(IdentifierType.CUSTOM, aasDescriptor.getIdentification()));
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        AssetAdministrationShellNode aasNode = new AssetAdministrationShellNode(aas);
        AssetNode assetNode = traverseAsset(aas.getAsset());
        aasNode.setAsset(assetNode);


        aasDescriptor.getSubmodelDescriptors().stream().forEach(smDescriptor -> {
            SubmodelNode submodelNode = traverseSubmodel(smDescriptor);
            aasNode.getSubmodels().add(submodelNode);
            aasNode.setSourceUrl(endpoint);
        });

        return neo4jTemplate.save(aasNode);
    }

    private AssetNode traverseAsset(IAsset asset) {
        AssetNode assetNode = new AssetNode(asset);
        // TODO: map more properties
        return neo4jTemplate.save(assetNode);
    }

    private SubmodelNode traverseSubmodel(SubmodelDescriptor smDescriptor) {
        log.info("traverseSubmodel {}", smDescriptor.getIdShort());

        String endpoint = smDescriptor.getEndpoints().get(0).getProtocolInformation().getEndpointAddress();
        ConnectedSubmodel submodel = new ConnectedSubmodel(modelProxyFactory.createProxy(endpoint));
        SubmodelNode node = new SubmodelNode(submodel.getLocalCopy());

        submodel.getLocalCopy().getSubmodelElements().values().stream().forEach(se -> {
            if (se == null) {
                log.warn("submodel element is null");
            } else {
                SubmodelElementNode submodelElementNode = traverseSubmodelElement(se.getLocalCopy(), endpoint + "/submodelElements");
                node.getSubmodelElements().add(submodelElementNode);
                node.setSourceUrl(endpoint);
            }
        });

        return neo4jTemplate.save(node);
    }


    private SubmodelElementNode traverseSubmodelElement(ISubmodelElement submodelElement, String parentSourceUrl) {
        //log.info("traverseSubmodelElement {}", submodelElement.getIdShort());

        SubmodelElementNode node = null;
        String type = submodelElement.getModelType();
        String sourceUrl = parentSourceUrl + "/" + submodelElement.getIdShort();

        switch (type) {
            case "Property":
                node = handleProperty((IProperty) submodelElement.getLocalCopy());
                break;
            case "File":
                node = handleFile((IFile) submodelElement.getLocalCopy());
                break;
            case "Blob":
                node = handleBlob((IBlob) submodelElement.getLocalCopy());
                break;
            case "Operation":
                node = traverseOperation((IOperation) submodelElement.getLocalCopy());
                break;
            case "BasicEvent":
                node = handleEvent((IEvent) submodelElement.getLocalCopy());
                break;
            case "ReferenceElement":
                node = handleReference((IReferenceElement) submodelElement.getLocalCopy());
                break;
            case "RelationshipElement":
                node = handleRelationship((IRelationshipElement) submodelElement.getLocalCopy());
                break;
            case "SubmodelElementCollection":
                node = traverseSubmodelElementCollection((ISubmodelElementCollection) submodelElement.getLocalCopy(), sourceUrl);
                break;
            default:
                node = handleUnknownElement(submodelElement.getLocalCopy());
        }

        node.setSourceUrl(sourceUrl);
        return neo4jTemplate.save(node);
    }


	private SubmodelElementCollectionNode traverseSubmodelElementCollection(ISubmodelElementCollection submodelElement, String sourceUrl) {
        log.info("traverseSubmodelElementCollection {}", submodelElement.getIdShort());

        var node = new SubmodelElementCollectionNode(submodelElement);
        submodelElement.getSubmodelElements().values().stream().forEach(se -> {
            if (se == null) {
                log.warn("submodel element is null");
            } else {
                SubmodelElementNode submodelElementNode = traverseSubmodelElement(se, sourceUrl);
                node.getSubmodelElements().add(submodelElementNode);
            }
        });

        return node;
    }

    private PropertyNode handleProperty(IProperty submodelElement) {
        log.info("handleProperty {}", submodelElement.getIdShort());
        var node = new PropertyNode(submodelElement);
        return node;
    }

    private FileNode handleFile(IFile submodelElement) {
        log.info("handleFile {}", submodelElement.getIdShort());
        var node = new FileNode(submodelElement);
        return node;
    }

    private BlobNode handleBlob(IBlob submodelElement) {
        log.info("handleBlob {}", submodelElement.getIdShort());
        var node = new BlobNode(submodelElement);
        return node;
    }

    private OperationNode traverseOperation(IOperation submodelElement) {
        log.info("handleOperation {}", submodelElement.getIdShort());

        var node = new OperationNode(submodelElement);
        
        submodelElement.getInputVariables().stream().forEach(iv -> {
            if (iv == null) {
                log.warn("input variable is null");
            } else {
                OperationVariableNode operationVariableNode = handleOperationVariable(iv);
                node.getInputVariables().add(operationVariableNode);
            }
        });
        
        submodelElement.getOutputVariables().stream().forEach(ov -> {
            if (ov == null) {
                log.warn("output variable is null");
            } else {
                OperationVariableNode operationVariableNode = handleOperationVariable(ov);
                node.getOutputVariables().add(operationVariableNode);
            }
        });
        
        submodelElement.getInOutputVariables().stream().forEach(iov -> {
            if (iov == null) {
                log.warn("inoutput variable is null");
            } else {
                OperationVariableNode operationVariableNode = handleOperationVariable(iov);
                node.getInoutputVariables().add(operationVariableNode);
            }
        });
        
        return node;
    }
    
    private OperationVariableNode handleOperationVariable(IOperationVariable operationVariable) {
    	log.info("handleOperationVariable");
    	var node = new OperationVariableNode(operationVariable);
    	return neo4jTemplate.save(node);
   	}

    private EventNode handleEvent(IEvent submodelElement) {
        log.info("handleEvent {}", submodelElement.getIdShort());
        var node = new EventNode(submodelElement);
        return node;
    }

    private ReferenceNode handleReference(IReferenceElement submodelElement) {
        log.info("handleReference {}", submodelElement.getIdShort());
        var node = new ReferenceNode(submodelElement);
        return node;
    }

    private RelationshipNode handleRelationship(IRelationshipElement submodelElement) {
        log.info("handleRelationship {}", submodelElement.getIdShort());
        var node = new RelationshipNode(submodelElement);
        return node;
    }

    private UnknownSubmodelElementNode handleUnknownElement(ISubmodelElement submodelElement) {
        log.info("handleUnknownElement {}", submodelElement.getIdShort());
        var node = new UnknownSubmodelElementNode(submodelElement);
        return node;
    }

    private void resolveReferences() {
        log.info("resolveReferences");
        List<ReferenceNode> referenceNodes = neo4jTemplate.findAll(ReferenceNode.class);

        for (ReferenceNode referenceNode : referenceNodes) {
            if (referenceNode.getTarget() == null) {
                List<String> pathToNode = referenceNode.getPathToNode();
                // Assumption: first element in path list is an IdentifiableNode
                var identifiableOpt = identifiableRepository.findById(pathToNode.get(0));
                if (identifiableOpt.isEmpty()) {
                    continue;
                }

                ReferableNode targetNode = identifiableOpt.get();
                boolean targetFound = false;
                if (pathToNode.size() > 1) {
                    for (int i = 1; i < pathToNode.size(); i++) {
                        //FIXME: this line does not work; submodel elements of child are deleted for some reason. query wrong?
                        //var childOptional = referableRepository.findChildByIdShort(targetNode.getNeo4jId(), pathToNode.get(i));
                        //workaround: retrieve ID of child and then use findById(ID)
                        var idOpt = referableRepository.findSubmodelElementId(targetNode.getNeo4jId(), pathToNode.get(i));
                        if (idOpt.isEmpty()) {
                            targetFound = false;
                            break;
                        }

                        var childOptional = neo4jTemplate.findById(idOpt.get(), ReferableNode.class);
                        targetNode = childOptional.get();
                        targetFound = true;

                    }
                } else {
                    log.debug("path <= 1");
                    targetFound = true;
                }
                if (targetFound) {
                    referenceNode.setTarget(targetNode);
                    neo4jTemplate.save(referenceNode);
                    var t = neo4jTemplate.findById(targetNode.getNeo4jId(), ReferableNode.class);
                    log.debug("check");
                } else {
                    log.debug("target not found");
                }
            } else {
                log.debug("target already set");
            }
        }
        log.info("resolveReferences - finished");
    }

}
