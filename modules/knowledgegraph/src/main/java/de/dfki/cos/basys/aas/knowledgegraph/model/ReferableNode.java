package de.dfki.cos.basys.aas.knowledgegraph.model;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.Node;

@Node("Referable")
@Getter
@Setter
public abstract class ReferableNode {

    @Id @GeneratedValue
    private Long neo4jId;

    private final String idShort;

    public ReferableNode(String idShort) {
        this.idShort = idShort;
    }
}

