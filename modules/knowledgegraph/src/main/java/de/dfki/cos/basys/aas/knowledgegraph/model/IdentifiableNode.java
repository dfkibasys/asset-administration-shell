package de.dfki.cos.basys.aas.knowledgegraph.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.Node;

@Node("Identifiable")
@Getter
@Setter
public abstract class IdentifiableNode extends ReferableNode {

    private final String id;

    public IdentifiableNode(String id, String idShort) {
        super(idShort);
        this.id = id;
    }
}
