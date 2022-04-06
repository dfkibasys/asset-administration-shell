package de.dfki.cos.basys.aas.knowledgegraph.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.Node;

@Node("Reference")
@Getter
@Setter
public class ReferenceNode extends SubmodelElementNode {

    public ReferenceNode(String idShort, String semanticId) {
        super(idShort, semanticId);
    }


}
