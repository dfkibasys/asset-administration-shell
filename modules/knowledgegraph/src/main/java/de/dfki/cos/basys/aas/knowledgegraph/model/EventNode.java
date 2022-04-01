package de.dfki.cos.basys.aas.knowledgegraph.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.Node;

@Node("Event")
@Getter
@Setter
public class EventNode extends SubmodelElementNode {

    public EventNode(String idShort, String semanticId) {
        super(idShort, semanticId);
    }
}
