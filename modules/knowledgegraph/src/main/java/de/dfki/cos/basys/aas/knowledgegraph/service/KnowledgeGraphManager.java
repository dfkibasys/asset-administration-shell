package de.dfki.cos.basys.aas.knowledgegraph.service;

import de.dfki.cos.basys.aas.knowledgegraph.model.*;
import de.dfki.cos.basys.aas.knowledgegraph.repository.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.basyx.aas.manager.api.IAssetAdministrationShellManager;
import org.eclipse.basyx.aas.registration.api.IAASRegistry;
import org.eclipse.basyx.aas.registry.client.api.RegistryAndDiscoveryInterfaceApi;
import org.eclipse.basyx.aas.registry.events.RegistryEvent;
import org.eclipse.basyx.aas.registry.model.*;
import org.eclipse.basyx.submodel.metamodel.api.ISubmodel;
import org.eclipse.basyx.submodel.metamodel.api.identifier.IdentifierType;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.ISubmodelElement;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.ISubmodelElementCollection;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.dataelement.IBlob;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.dataelement.IFile;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.dataelement.IProperty;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.dataelement.IReferenceElement;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.event.IEvent;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.operation.IOperation;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.relationship.IRelationshipElement;
import org.eclipse.basyx.submodel.metamodel.connected.ConnectedSubmodel;
import org.eclipse.basyx.submodel.metamodel.map.identifier.Identifier;
import org.eclipse.basyx.vab.factory.java.ModelProxyFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

@Service
@Slf4j
@RequiredArgsConstructor
public class KnowledgeGraphManager {

    @Autowired
    AssetAdministrationShellRepository aasRepository;

    @Autowired
    SubmodelElementCollectionRepository submodelElementCollectionRepository;

    @Autowired
    SubmodelRepository submodelRepository;

    @Autowired
    PropertyRepository propertyRepository;

    @Autowired
    FileRepository fileRepository;

    @Autowired
    BlobRepository blobRepository;

    @Autowired
    OperationRepository operationRepository;

    @Autowired
    EventRepository eventRepository;

    @Autowired
    ReferenceRepository referenceRepository;

    @Autowired
    RelationshipRepository relationshipRepository;

    @Autowired
    UnknownSubmodelElementRepository unknownSubmodelElementRepository;

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
        aasRepository.deleteAllCascading();
    }

    @PostConstruct
    public void bootstrapKnowledgeGraph() {
        log.info("bootstrapKnowledgeGraph - start");
        try {
            var aasDescriptors = registryAndDiscoveryInterfaceApi.getAllAssetAdministrationShellDescriptors();
            for (var aasDescriptor : aasDescriptors) {
                var aasNode = traverseAAS(aasDescriptor);
            }
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
    }


    private AssetAdministrationShellNode traverseAAS(AssetAdministrationShellDescriptor aasDescriptor) {
        log.info("traverseAAS {}", aasDescriptor.getIdShort());
        String id = aasDescriptor.getIdentification();
        String idShort = aasDescriptor.getIdShort();

        AssetAdministrationShellNode aasNode = new AssetAdministrationShellNode(id, idShort);

        aasDescriptor.getSubmodelDescriptors().stream().forEach(smDescriptor -> {
            SubmodelNode submodelNode = traverseSubmodel(smDescriptor);
            aasNode.getSubmodels().add(submodelNode);
        });

        return aasRepository.save(aasNode);
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

        SubmodelNode node = new SubmodelNode (id, idShort, semanticId);

        ISubmodel submodel = new ConnectedSubmodel(modelProxyFactory.createProxy(endpoint));

        submodel.getSubmodelElements().values().stream().forEach(se -> {
            if (se == null) {
                log.warn("submodel element is null");
            } else {
                SubmodelElementNode submodelElementNode = traverseSubmodelElement(se);
                node.getSubmodelElements().add(submodelElementNode);
            }
        });

        return submodelRepository.save(node);
    }


    private SubmodelElementNode traverseSubmodelElement(ISubmodelElement submodelElement) {
        //log.info("traverseSubmodelElement {}", submodelElement.getIdShort());
        String type = submodelElement.getModelType();

        switch (type) {
            case "Property":
                return handleProperty((IProperty) submodelElement);
            case "File":
                return handleFile((IFile) submodelElement);
            case "Blob":
                return handleBlob((IBlob) submodelElement);
            case "Operation":
                return handleOperation((IOperation) submodelElement);
            case "BasicEvent":
                return handleEvent((IEvent) submodelElement);
            case "ReferenceElement":
                return handleReference((IReferenceElement) submodelElement);
            case "RelationshipElement":
                return handleRelationship((IRelationshipElement) submodelElement);
            case "SubmodelElementCollection":
                return traverseSubmodelElementCollection((ISubmodelElementCollection) submodelElement);
            default:
                return handleUnknownElement(submodelElement);
        }
    }

    private SubmodelElementCollectionNode traverseSubmodelElementCollection(ISubmodelElementCollection submodelElement) {
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
                SubmodelElementNode submodelElementNode = traverseSubmodelElement(se);
                node.getSubmodelElements().add(submodelElementNode);
            }
        });

        return submodelElementCollectionRepository.save(node);
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

        return propertyRepository.save(node);
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

        return fileRepository.save(node);
    }

    private BlobNode handleBlob(IBlob submodelElement) {
        log.info("handleBlob {}", submodelElement.getIdShort());
        String idShort = submodelElement.getIdShort();
        String semanticId = null;
        if (submodelElement.getSemanticId() != null && submodelElement.getSemanticId().getKeys().size() > 0) {
            semanticId = submodelElement.getSemanticId().getKeys().get(0).getValue();
        }

        var node = new BlobNode(idShort, semanticId);

        return blobRepository.save(node);
    }

    private OperationNode handleOperation(IOperation submodelElement) {
        log.info("handleOperation {}", submodelElement.getIdShort());
        String idShort = submodelElement.getIdShort();
        String semanticId = null;
        if (submodelElement.getSemanticId() != null && submodelElement.getSemanticId().getKeys().size() > 0) {
            semanticId = submodelElement.getSemanticId().getKeys().get(0).getValue();
        }

        var node = new OperationNode(idShort, semanticId);

        return operationRepository.save(node);
    }

    private EventNode handleEvent(IEvent submodelElement) {
        log.info("handleEvent {}", submodelElement.getIdShort());
        String idShort = submodelElement.getIdShort();
        String semanticId = null;
        if (submodelElement.getSemanticId() != null && submodelElement.getSemanticId().getKeys().size() > 0) {
            semanticId = submodelElement.getSemanticId().getKeys().get(0).getValue();
        }

        var node = new EventNode(idShort, semanticId);

        return eventRepository.save(node);
    }

    private ReferenceNode handleReference(IReferenceElement submodelElement) {
        log.info("handleReference {}", submodelElement.getIdShort());
        String idShort = submodelElement.getIdShort();
        String semanticId = null;
        if (submodelElement.getSemanticId() != null && submodelElement.getSemanticId().getKeys().size() > 0) {
            semanticId = submodelElement.getSemanticId().getKeys().get(0).getValue();
        }

        var node = new ReferenceNode(idShort, semanticId);

        return referenceRepository.save(node);
    }

    private RelationshipNode handleRelationship(IRelationshipElement submodelElement) {
        log.info("handleRelationship {}", submodelElement.getIdShort());
        String idShort = submodelElement.getIdShort();
        String semanticId = null;
        if (submodelElement.getSemanticId() != null && submodelElement.getSemanticId().getKeys().size() > 0) {
            semanticId = submodelElement.getSemanticId().getKeys().get(0).getValue();
        }

        var node = new RelationshipNode(idShort, semanticId);

        return relationshipRepository.save(node);
    }

    private UnknownSubmodelElementNode handleUnknownElement(ISubmodelElement submodelElement) {
        log.info("handleUnknownElement {}", submodelElement.getIdShort());
        String idShort = submodelElement.getIdShort();
        String semanticId = null;
        if (submodelElement.getSemanticId() != null && submodelElement.getSemanticId().getKeys().size() > 0) {
            semanticId = submodelElement.getSemanticId().getKeys().get(0).getValue();
        }

        var node = new UnknownSubmodelElementNode(idShort, semanticId);

        return unknownSubmodelElementRepository.save(node);
    }
}
