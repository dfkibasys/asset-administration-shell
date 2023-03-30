package de.dfki.cos.basys.aas.knowledgegraph.model;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.ISubmodelElement;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.dataelement.IProperty;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.operation.IOperationVariable;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.ArrayList;
import java.util.List;

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
