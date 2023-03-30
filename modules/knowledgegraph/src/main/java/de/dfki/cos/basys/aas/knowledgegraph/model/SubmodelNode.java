package de.dfki.cos.basys.aas.knowledgegraph.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.eclipse.basyx.submodel.metamodel.api.ISubmodel;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.schema.Relationship.Direction;

import java.util.ArrayList;
import java.util.List;


@Node("Submodel")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SubmodelNode extends IdentifiableNode  {

	private String semanticId;

	@Relationship(type = "hasSubmodelElement", direction = Direction.OUTGOING)
	private List<SubmodelElementNode> submodelElements = new ArrayList<>();

	public SubmodelNode(ISubmodel submodel) {
		super(submodel);
		if (submodel.getSemanticId() != null && submodel.getSemanticId().getKeys().size() > 0) {
			this.semanticId = submodel.getSemanticId().getKeys().get(0).getValue();
		} else {
			this.semanticId = "null";
		}
	}

}
