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
import org.eclipse.basyx.submodel.metamodel.map.identifier.Identifier;
import org.eclipse.basyx.vab.factory.java.ModelProxyFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
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

        AssetAdministrationShellNode aasNode = new AssetAdministrationShellNode(id, idShort);

        try {
            IAssetAdministrationShell aas = aasManager.retrieveAAS(new Identifier(IdentifierType.CUSTOM, aasDescriptor.getIdentification()));
            AssetNode assetNode = traverseAsset(aas.getAsset());
            aasNode.setAsset(assetNode);
        } catch (Exception e) {
            e.printStackTrace();
        }

        aasDescriptor.getSubmodelDescriptors().stream().forEach(smDescriptor -> {
            SubmodelNode submodelNode = traverseSubmodel(smDescriptor);
            aasNode.getSubmodels().add(submodelNode);
            aasNode.setSourceUrl(endpoint);
        });

        return neo4jTemplate.save(aasNode);
    }

    private AssetNode traverseAsset(IAsset asset) {
        AssetNode assetNode = new AssetNode(asset.getIdentification().getId(), asset.getIdShort());
        // TODO: map more properties
        return neo4jTemplate.save(assetNode);
    }

    private SubmodelNode traverseSubmodel(SubmodelDescriptor smDescriptor) {
        log.info("traverseSubmodel {}", smDescriptor.getIdShort());
        String id = smDescriptor.getIdentification();
        String idShort = smDescriptor.getIdShort();
        String semanticId = null;
        String endpoint = smDescriptor.getEndpoints().get(0).getProtocolInformation().getEndpointAddress();

        if (smDescriptor.getSemanticId() != null) {
            ModelReference modelReference = ((ModelReference) smDescriptor.getSemanticId());
            if (modelReference.getKeys() != null && !modelReference.getKeys().isEmpty()) {
                semanticId = modelReference.getKeys().get(0).getValue();
            }
        }

        SubmodelNode node = new SubmodelNode(id, idShort, semanticId);

        ISubmodel submodel = new ConnectedSubmodel(modelProxyFactory.createProxy(endpoint));

        submodel.getSubmodelElements().values().stream().forEach(se -> {
            if (se == null) {
                log.warn("submodel element is null");
            } else {
                SubmodelElementNode submodelElementNode = traverseSubmodelElement(se, endpoint + "/submodelElements");
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
                node = handleProperty((IProperty) submodelElement);
                break;
            case "File":
                node = handleFile((IFile) submodelElement);
                break;
            case "Blob":
                node = handleBlob((IBlob) submodelElement);
                break;
            case "Operation":
                node = traverseOperation((IOperation) submodelElement);
                break;
            case "BasicEvent":
                node = handleEvent((IEvent) submodelElement);
                break;
            case "ReferenceElement":
                node = handleReference((IReferenceElement) submodelElement);
                break;
            case "RelationshipElement":
                node = handleRelationship((IRelationshipElement) submodelElement);
                break;
            case "SubmodelElementCollection":
                node = traverseSubmodelElementCollection((ISubmodelElementCollection) submodelElement, sourceUrl);
                break;
            default:
                node = handleUnknownElement(submodelElement);
        }

        node.setSourceUrl(sourceUrl);
        return neo4jTemplate.save(node);
    }


	private SubmodelElementCollectionNode traverseSubmodelElementCollection(ISubmodelElementCollection submodelElement, String sourceUrl) {
        log.info("traverseSubmodelElementCollection {}", submodelElement.getIdShort());
        String idShort = submodelElement.getIdShort();
        String semanticId = null;
        if (submodelElement.getSemanticId() != null && submodelElement.getSemanticId().getKeys().size() > 0) {
            semanticId = submodelElement.getSemanticId().getKeys().get(0).getValue();
        }

        var node = new SubmodelElementCollectionNode(idShort, semanticId);
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
        String idShort = submodelElement.getIdShort();
        String semanticId = null;
        if (submodelElement.getSemanticId() != null && submodelElement.getSemanticId().getKeys().size() > 0) {
            semanticId = submodelElement.getSemanticId().getKeys().get(0).getValue();
        }

        var node = new PropertyNode(idShort, semanticId);
        node.setValueType(submodelElement.getValueType());
        node.setValue(submodelElement.getValue());

        return node;
    }

    private FileNode handleFile(IFile submodelElement) {
        log.info("handleFile {}", submodelElement.getIdShort());
        String idShort = submodelElement.getIdShort();
        String semanticId = null;
        if (submodelElement.getSemanticId() != null && submodelElement.getSemanticId().getKeys().size() > 0) {
            semanticId = submodelElement.getSemanticId().getKeys().get(0).getValue();
        }

        var node = new FileNode(idShort, semanticId);
        node.setMimeType(submodelElement.getMimeType());
        node.setValue(submodelElement.getValue());

        return node;
    }

    private BlobNode handleBlob(IBlob submodelElement) {
        log.info("handleBlob {}", submodelElement.getIdShort());
        String idShort = submodelElement.getIdShort();
        String semanticId = null;
        if (submodelElement.getSemanticId() != null && submodelElement.getSemanticId().getKeys().size() > 0) {
            semanticId = submodelElement.getSemanticId().getKeys().get(0).getValue();
        }

        var node = new BlobNode(idShort, semanticId);

        return node;
    }

    private OperationNode traverseOperation(IOperation submodelElement) {
        log.info("handleOperation {}", submodelElement.getIdShort());
        String idShort = submodelElement.getIdShort();
        String semanticId = null;
        if (submodelElement.getSemanticId() != null && submodelElement.getSemanticId().getKeys().size() > 0) {
            semanticId = submodelElement.getSemanticId().getKeys().get(0).getValue();
        }
        
        var node = new OperationNode(idShort, semanticId);
        
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
    
    private OperationVariableNode handleOperationVariable(IOperationVariable iOperationVariable) {
    	log.info("handleOperationVariable");
    	
    	var node = new OperationVariableNode(iOperationVariable.getValue());
    	
    	return neo4jTemplate.save(node);
   	}

    private EventNode handleEvent(IEvent submodelElement) {
        log.info("handleEvent {}", submodelElement.getIdShort());
        String idShort = submodelElement.getIdShort();
        String semanticId = null;
        if (submodelElement.getSemanticId() != null && submodelElement.getSemanticId().getKeys().size() > 0) {
            semanticId = submodelElement.getSemanticId().getKeys().get(0).getValue();
        }

        var node = new EventNode(idShort, semanticId);

        return node;
    }

    private ReferenceNode handleReference(IReferenceElement submodelElement) {
        log.info("handleReference {}", submodelElement.getIdShort());
        String idShort = submodelElement.getIdShort();
        String semanticId = null;
        if (submodelElement.getSemanticId() != null && submodelElement.getSemanticId().getKeys().size() > 0) {
            semanticId = submodelElement.getSemanticId().getKeys().get(0).getValue();
        }

        var node = new ReferenceNode(idShort, semanticId);

        if (submodelElement.getValue() != null && submodelElement.getValue().getKeys().size() > 0) {
            var pathToNode = submodelElement.getValue().getKeys();
            for (var key : pathToNode) {
                node.getPathToNode().add(key.getValue());
            }
            log.debug(node.getPathToNode().toString());
        }

        return node;
    }

    private RelationshipNode handleRelationship(IRelationshipElement submodelElement) {
        log.info("handleRelationship {}", submodelElement.getIdShort());
        String idShort = submodelElement.getIdShort();
        String semanticId = null;
        if (submodelElement.getSemanticId() != null && submodelElement.getSemanticId().getKeys().size() > 0) {
            semanticId = submodelElement.getSemanticId().getKeys().get(0).getValue();
        }

        var node = new RelationshipNode(idShort, semanticId);
        return node;
    }

    private UnknownSubmodelElementNode handleUnknownElement(ISubmodelElement submodelElement) {
        log.info("handleUnknownElement {}", submodelElement.getIdShort());
        String idShort = submodelElement.getIdShort();
        String semanticId = null;
        if (submodelElement.getSemanticId() != null && submodelElement.getSemanticId().getKeys().size() > 0) {
            semanticId = submodelElement.getSemanticId().getKeys().get(0).getValue();
        }

        var node = new UnknownSubmodelElementNode(idShort, semanticId);

        return node;
    }

    private void resolveReferences() {
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
    }

}
