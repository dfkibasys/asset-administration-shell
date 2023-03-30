package de.dfki.cos.basys.aas.knowledgegraph.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.dataelement.IProperty;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.operation.IOperationVariable;
import org.springframework.data.neo4j.core.schema.Node;

@Node("OperationVariable")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class OperationVariableNode extends PropertyNode {

	// TODO: What do we want to point this to? Reference-Style?
	//private ISubmodelElement value;

	public OperationVariableNode(IOperationVariable var) {
		super((IProperty) var.getValue());
	}

}
