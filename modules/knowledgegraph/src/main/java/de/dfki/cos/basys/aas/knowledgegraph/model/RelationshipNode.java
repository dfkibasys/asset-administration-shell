package de.dfki.cos.basys.aas.knowledgegraph.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.Node;

@Node("Relationship")
@Getter
@Setter
public class RelationshipNode extends SubmodelElementNode {

    public RelationshipNode(String idShort, String semanticId) {
        super(idShort, semanticId);
    }
}
