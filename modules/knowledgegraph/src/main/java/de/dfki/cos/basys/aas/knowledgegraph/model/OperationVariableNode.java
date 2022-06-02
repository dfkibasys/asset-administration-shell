package de.dfki.cos.basys.aas.knowledgegraph.model;

import org.eclipse.basyx.submodel.metamodel.api.submodelelement.ISubmodelElement;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

import lombok.Getter;
import lombok.Setter;

@Node("OperationVariable")
@Getter
@Setter
public class OperationVariableNode {
	
	@Id @GeneratedValue
    private Long neo4jId;
	
	// TODO: What do we want to point this to? Reference-Style?
	private ISubmodelElement value;

	public OperationVariableNode(ISubmodelElement value) {
		this.value = value;
	}

}
