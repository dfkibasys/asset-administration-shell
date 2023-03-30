package de.dfki.cos.basys.aas.knowledgegraph.model;

import lombok.*;
import org.eclipse.basyx.submodel.metamodel.api.qualifier.IReferable;
import org.eclipse.basyx.submodel.metamodel.api.reference.IReference;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.ISubmodelElement;
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
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class SubmodelElementNode extends ReferableNode {

	private String semanticId;

	public SubmodelElementNode(ISubmodelElement submodelElement) {
		super(submodelElement);
		if (submodelElement.getSemanticId() != null && submodelElement.getSemanticId().getKeys().size() > 0) {
			this.semanticId = submodelElement.getSemanticId().getKeys().get(0).getValue();
		} else {
			this.semanticId = "null";
		}
	}

}
