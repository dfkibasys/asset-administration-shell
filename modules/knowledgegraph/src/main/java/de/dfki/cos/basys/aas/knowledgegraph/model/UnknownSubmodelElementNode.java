package de.dfki.cos.basys.aas.knowledgegraph.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.ISubmodelElement;
import org.springframework.data.neo4j.core.schema.Node;


@Node("UnknownSubmodelElement")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UnknownSubmodelElementNode extends SubmodelElementNode {

	public UnknownSubmodelElementNode(ISubmodelElement submodelElement) {
		super(submodelElement);
	}
}
