package de.dfki.cos.basys.aas.knowledgegraph.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.schema.Relationship.Direction;

@Node("Operation")
@Getter
@Setter
public class OperationNode extends SubmodelElementNode {

    public OperationNode(String idShort, String semanticId) {
        super(idShort, semanticId);
    }
    
    @Relationship(type = "hasInputVariable", direction = Direction.OUTGOING)
    private List<OperationVariableNode> inputVariables = new ArrayList<>();
    
    @Relationship(type = "hasOutputVariable", direction = Direction.OUTGOING)
    private List<OperationVariableNode> outputVariables = new ArrayList<>();
    
    @Relationship(type = "hasInoutputVariable", direction = Direction.OUTGOING)
    private List<OperationVariableNode> inoutputVariables = new ArrayList<>();
}
