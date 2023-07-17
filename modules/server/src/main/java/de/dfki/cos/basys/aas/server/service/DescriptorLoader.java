package de.dfki.cos.basys.aas.server.service;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

import org.eclipse.basyx.aas.aggregator.restapi.AASAggregatorProvider;
import org.eclipse.basyx.aas.bundle.AASBundle;
import org.eclipse.basyx.aas.metamodel.map.AssetAdministrationShell;
import org.eclipse.basyx.aas.metamodel.map.descriptor.AASDescriptor;
import org.eclipse.basyx.aas.metamodel.map.descriptor.ModelDescriptor;
import org.eclipse.basyx.aas.metamodel.map.descriptor.SubmodelDescriptor;
import org.eclipse.basyx.submodel.metamodel.api.ISubmodel;
import org.eclipse.basyx.vab.modelprovider.VABPathTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.dfki.cos.basys.aas.server.configuration.BaSyxContextConfiguration;
import de.dfki.cos.basys.aas.server.configuration.BaSyxContextConfiguration.ServerLocation;
import lombok.RequiredArgsConstructor;

@Service
public class DescriptorLoader {

    @Autowired
    private BaSyxContextConfiguration context;

    public AASDescriptor retrieveDescriptor(AASBundle aasBundle) {
        List<ServerLocation> locations = context.getAllLocations();

        AASDescriptor descr = new AASDescriptor(aasBundle.getAAS(), "");
        EndpointAssinger<AASDescriptor> aasEpAssigner = new EndpointAssinger<>(aasBundle, locations,
                this::toAasAddress);
        aasEpAssigner.assignEndpoints(descr);

        EndpointAssinger<SubmodelDescriptor> smEpAssigner = new EndpointAssinger<>(aasBundle, locations,
                this::toSubmodelAddress);
        for (ISubmodel eachSubmodel : aasBundle.getSubmodels()) {
            SubmodelDescriptor smDesc = new SubmodelDescriptor(eachSubmodel, "");
            smEpAssigner.assignEndpoints(smDesc);
        }
        return descr;
    }

    private String toAasAddress(String base, AASDescriptor descr) {
        return base;
    }

    private String toSubmodelAddress(String aasBase, SubmodelDescriptor smDesc) {
        return VABPathTools.concatenatePaths(aasBase, "submodels", smDesc.getIdShort(), "submodel");
    }

    @RequiredArgsConstructor
    private static final class EndpointAssinger<T extends ModelDescriptor> {

        private final AASBundle aasBundle;
        private final List<ServerLocation> locations;
        private final BiFunction<String, T, String> toAddress;

        public void assignEndpoints(T descr) {
            List<Map<String, Object>> endpointsRaw = new ArrayList<>(locations.size());
            for (ServerLocation eachLocation : locations) {
                String aasBase = getAasBasePath(aasBundle, eachLocation);
                String address = toAddress.apply(aasBase, descr);
                Map<String, Object> endpointWrapper = getEndpointWrapper(eachLocation.getProtocol(), address);
                endpointsRaw.add(endpointWrapper);
            }
            descr.put(ModelDescriptor.ENDPOINTS, endpointsRaw);
        }

        private String getAasBasePath(AASBundle bundle, ServerLocation location) {
            String hostBasePath = location.getUrl() ;
            // Normalize hostBasePath to ensure consistent usage of /
            String nHostBasePath = VABPathTools.stripSlashes(hostBasePath) + "/" + AASAggregatorProvider.PREFIX;
            // Create AASDescriptor
            String endpointId = encodeId(bundle.getAAS().getIdentification().getId());
            
            // endpointId = VABPathTools.encodePathElement(endpointId);
            return VABPathTools.concatenatePaths(nHostBasePath, endpointId, "aas");
        }

        private Map<String, Object> getEndpointWrapper(String protocol, String address) {
            LinkedHashMap<String, Object> endpointWrapper = new LinkedHashMap<>();
            endpointWrapper.put(AssetAdministrationShell.TYPE, protocol);
            endpointWrapper.put(AssetAdministrationShell.ADDRESS, address);
            return endpointWrapper;
        }

        private String encodeId(String id) {
            return Base64.getUrlEncoder().encodeToString(id.getBytes(StandardCharsets.UTF_8));
        }
    }
}
