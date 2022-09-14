package de.dfki.cos.basys.aas.knowledgegraph.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.schema.Relationship.Direction;

import java.util.HashSet;
import java.util.Set;


@Node("Asset")
@Getter
@Setter
public class AssetNode extends IdentifiableNode {

	public AssetNode(String id, String idShort) {
		super(id, idShort);
	}
}
