package de.dfki.cos.basys.aas.knowledgegraph.model;

import lombok.*;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.schema.Relationship.Direction;

import java.util.HashSet;
import java.util.Set;


@Node("SubmodelElement")
@Getter
@Setter
public abstract class SubmodelElementNode extends ReferableNode {

	private final String semanticId;

	public SubmodelElementNode(String idShort, String semanticId) {
		super(idShort);
		this.semanticId = semanticId;
	}

}
