package de.dfki.cos.basys.aas.knowledgegraph.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node("Capability")
@Getter
@Setter
public class CapabilityNode extends SubmodelElementNode {

    public CapabilityNode(String idShort, String semanticId) {
        super(idShort, semanticId);
    }
}
