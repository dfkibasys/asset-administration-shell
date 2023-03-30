package de.dfki.cos.basys.aas.knowledgegraph.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.ISubmodelElement;
import org.springframework.data.neo4j.core.schema.Node;


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
