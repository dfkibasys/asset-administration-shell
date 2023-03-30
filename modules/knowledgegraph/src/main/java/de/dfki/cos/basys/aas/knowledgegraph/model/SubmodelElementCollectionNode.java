package de.dfki.cos.basys.aas.knowledgegraph.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.ISubmodelElementCollection;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.schema.Relationship.Direction;

import java.util.ArrayList;
import java.util.List;

@Node("SubmodelElementCollection")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SubmodelElementCollectionNode extends SubmodelElementNode {

	@Relationship(type = "hasSubmodelElement", direction = Direction.OUTGOING)
	private List<SubmodelElementNode> submodelElements = new ArrayList<>();

	public SubmodelElementCollectionNode(ISubmodelElementCollection smCollection) {
		super(smCollection);
	}
}


