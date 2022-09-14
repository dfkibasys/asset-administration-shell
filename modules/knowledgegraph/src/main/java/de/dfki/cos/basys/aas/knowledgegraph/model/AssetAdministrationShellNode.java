package de.dfki.cos.basys.aas.knowledgegraph.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.schema.Relationship.Direction;


@Node("AssetAdministrationShell")
@Getter
@Setter
public class AssetAdministrationShellNode extends IdentifiableNode {

	@Relationship(type = "hasSubmodel", direction = Direction.OUTGOING)
	private List<SubmodelNode> submodels = new ArrayList<>();

	@Relationship(type = "hasAsset", direction = Direction.OUTGOING)
	private AssetNode asset = null;

	public AssetAdministrationShellNode(String id, String idShort) {
		super(id, idShort);
	}
}
