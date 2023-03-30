package de.dfki.cos.basys.aas.knowledgegraph.model;

import lombok.*;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.ICapability;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
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
