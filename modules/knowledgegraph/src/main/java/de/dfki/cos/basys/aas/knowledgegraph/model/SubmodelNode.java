package de.dfki.cos.basys.aas.knowledgegraph.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import lombok.*;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.schema.Relationship.Direction;


@Node("Submodel")
@Getter
@Setter
public class SubmodelNode extends IdentifiableNode  {

	private final String semanticId;

	@Relationship(type = "hasSubmodelElement", direction = Direction.OUTGOING)
	private List<SubmodelElementNode> submodelElements = new ArrayList<>();

	public SubmodelNode(String id, String idShort, String semanticId) {
		super(id, idShort);
		this.semanticId = semanticId;
	}
}
