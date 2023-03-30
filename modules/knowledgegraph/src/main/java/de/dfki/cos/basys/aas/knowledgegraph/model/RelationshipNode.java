package de.dfki.cos.basys.aas.knowledgegraph.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.relationship.IRelationshipElement;
import org.springframework.data.neo4j.core.schema.Node;

@Node("Relationship")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RelationshipNode extends SubmodelElementNode {

    public RelationshipNode(IRelationshipElement submodelElement) {
        super(submodelElement);
    }
}
