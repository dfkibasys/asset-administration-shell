package de.dfki.cos.basys.aas.knowledgegraph.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.schema.Relationship.Direction;

import java.util.ArrayList;
import java.util.List;

@Node("Reference")
@Getter
@Setter
public class ReferenceNode extends SubmodelElementNode {

    private List<String> pathToNode = new ArrayList<>();

    @Relationship(type = "refersTo", direction = Direction.OUTGOING)
    private ReferableNode target = null;


    public ReferenceNode(String idShort, String semanticId) {
        super(idShort, semanticId);
    }

}
