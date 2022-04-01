package de.dfki.cos.basys.aas.knowledgegraph.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.Node;

@Node("Operation")
@Getter
@Setter
public class OperationNode extends SubmodelElementNode {

    public OperationNode(String idShort, String semanticId) {
        super(idShort, semanticId);
    }
}
