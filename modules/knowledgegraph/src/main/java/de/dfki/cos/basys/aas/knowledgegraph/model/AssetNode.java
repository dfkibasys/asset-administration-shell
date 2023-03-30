package de.dfki.cos.basys.aas.knowledgegraph.model;

import lombok.*;
import org.eclipse.basyx.aas.metamodel.api.parts.asset.IAsset;
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
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AssetNode extends IdentifiableNode {

	public AssetNode(IAsset asset) {
		super(asset);
	}
}
