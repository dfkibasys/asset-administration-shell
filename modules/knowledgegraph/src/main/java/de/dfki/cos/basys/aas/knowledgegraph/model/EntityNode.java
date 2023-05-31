package de.dfki.cos.basys.aas.knowledgegraph.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.entity.IEntity;
import org.springframework.data.neo4j.core.schema.Node;

@Node("Entity")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class EntityNode extends SubmodelElementNode {

    String entityType;

    public EntityNode(IEntity submodelElement) {
        super(submodelElement);
        entityType = submodelElement.getEntityType().toString();
    }
}
