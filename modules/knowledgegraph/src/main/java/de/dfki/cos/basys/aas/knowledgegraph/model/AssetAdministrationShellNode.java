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
@Data
public class AssetAdministrationShellNode {

	@Id
	private final String id;

	private final String idShort;
	
	@Relationship(type = "hasSubmodel", direction = Direction.OUTGOING)
	private List<SubmodelNode> submodels = new ArrayList<>();

	@Relationship(type = "hasAsset", direction = Direction.OUTGOING)
	private AssetNode asset = null;

}
