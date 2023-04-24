package de.dfki.cos.basys.aas.knowledgegraph.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.operation.IOperation;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.schema.Relationship.Direction;

import java.util.ArrayList;
import java.util.List;

@Node("Operation")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class OperationNode extends SubmodelElementNode {

    @Relationship(type = "hasInputVariable", direction = Direction.OUTGOING)
    private List<OperationVariableNode> inputVariables = new ArrayList<>();
    
    @Relationship(type = "hasOutputVariable", direction = Direction.OUTGOING)
    private List<OperationVariableNode> outputVariables = new ArrayList<>();
    
    @Relationship(type = "hasInoutputVariable", direction = Direction.OUTGOING)
    private List<OperationVariableNode> inoutputVariables = new ArrayList<>();

    public OperationNode(IOperation operation) {
        super(operation);
    }
}
