package de.dfki.cos.basys.aas.knowledgegraph.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.eclipse.basyx.aas.metamodel.api.parts.asset.IAsset;
import org.springframework.data.neo4j.core.schema.Node;


@Node("Asset")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AssetNode extends IdentifiableNode {

	public AssetNode(IAsset asset) {
		super(asset);
	}
}
