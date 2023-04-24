package de.dfki.cos.basys.aas.knowledgegraph.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.ICapability;
import org.springframework.data.neo4j.core.schema.Node;

@Node("Capability")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CapabilityNode extends SubmodelElementNode {

    public CapabilityNode(ICapability capability) {
        super(capability);
    }
}
