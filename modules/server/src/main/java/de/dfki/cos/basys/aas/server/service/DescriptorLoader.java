package de.dfki.cos.basys.aas.server.service;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import org.eclipse.basyx.aas.aggregator.restapi.AASAggregatorProvider;
import org.eclipse.basyx.aas.metamodel.map.descriptor.AASDescriptor;
import org.eclipse.basyx.aas.metamodel.map.descriptor.SubmodelDescriptor;
import org.eclipse.basyx.aas.bundle.AASBundle;
import org.eclipse.basyx.vab.modelprovider.VABPathTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.dfki.cos.basys.aas.server.configuration.BaSyxContextConfiguration;

@Service
public class DescriptorLoader {

    @Autowired
    private BaSyxContextConfiguration context;

    public AASDescriptor retrieveDescriptor(AASBundle aasBundle) {
        // Base path + aggregator accessor
        String fullBasePath = context.toLegacyConfig().getUrl() + "/" + AASAggregatorProvider.PREFIX;
        if (context.isTlsEnabled() && fullBasePath.startsWith("http://")) {
            fullBasePath = "https" + fullBasePath.substring(4);
        }
        return createAASDescriptor(aasBundle, fullBasePath);
    }

    public AASDescriptor createAASDescriptor(AASBundle bundle, String hostBasePath) {
        // Normalize hostBasePath to ensure consistent usage of /
        String nHostBasePath = VABPathTools.stripSlashes(hostBasePath);

        // Create AASDescriptor
        String endpointId = encodeId(bundle.getAAS().getIdentification().getId());
        // endpointId = VABPathTools.encodePathElement(endpointId);
        String aasBase = VABPathTools.concatenatePaths(nHostBasePath, endpointId, "aas");
        AASDescriptor desc = new AASDescriptor(bundle.getAAS(), aasBase);
        bundle.getSubmodels().stream().forEach(s -> {
            SubmodelDescriptor smDesc = new SubmodelDescriptor(s,
                    VABPathTools.concatenatePaths(aasBase, "submodels", s.getIdShort(), "submodel"));
            desc.addSubmodelDescriptor(smDesc);
        });
        return desc;
    }

    private String encodeId(String id) {
        return Base64.getUrlEncoder().encodeToString(id.getBytes(StandardCharsets.UTF_8));
    }
}
