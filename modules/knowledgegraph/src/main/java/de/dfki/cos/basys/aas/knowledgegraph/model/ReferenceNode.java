package de.dfki.cos.basys.aas.knowledgegraph.model;

import lombok.*;
import org.eclipse.basyx.submodel.metamodel.api.reference.IReference;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.ISubmodelElement;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.dataelement.IReferenceElement;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.schema.Relationship.Direction;

import java.util.ArrayList;
import java.util.List;

@Node("Reference")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ReferenceNode extends SubmodelElementNode {

    private List<String> pathToNode = new ArrayList<>();

    @Relationship(type = "refersTo", direction = Direction.OUTGOING)
    private ReferableNode target = null;

    public ReferenceNode(IReferenceElement submodelElement) {
        super(submodelElement);

        if (submodelElement.getValue() != null && submodelElement.getValue().getKeys().size() > 0) {
            var pathToNode = submodelElement.getValue().getKeys();
            for (var key : pathToNode) {
                getPathToNode().add(key.getValue());
            }
        }
    }
}
