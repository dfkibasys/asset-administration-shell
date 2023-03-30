package de.dfki.cos.basys.aas.knowledgegraph.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.eclipse.basyx.aas.metamodel.api.IAssetAdministrationShell;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.schema.Relationship.Direction;

import java.util.ArrayList;
import java.util.List;


@Node("AssetAdministrationShell")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AssetAdministrationShellNode extends IdentifiableNode {

	@Relationship(type = "hasSubmodel", direction = Direction.OUTGOING)
	private List<SubmodelNode> submodels = new ArrayList<>();

	@Relationship(type = "hasAsset", direction = Direction.OUTGOING)
	private AssetNode asset = null;

	public AssetAdministrationShellNode(IAssetAdministrationShell aas) {
		super(aas);
	}
}
