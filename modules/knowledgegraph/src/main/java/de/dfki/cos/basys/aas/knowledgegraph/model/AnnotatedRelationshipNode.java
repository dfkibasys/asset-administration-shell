package de.dfki.cos.basys.aas.knowledgegraph.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.relationship.IAnnotatedRelationshipElement;
import org.springframework.data.neo4j.core.schema.Node;

@Node("AnnotatedRelationship")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AnnotatedRelationshipNode extends RelationshipNode {

    public AnnotatedRelationshipNode(IAnnotatedRelationshipElement submodelElement) {
        super(submodelElement);
    }
}
