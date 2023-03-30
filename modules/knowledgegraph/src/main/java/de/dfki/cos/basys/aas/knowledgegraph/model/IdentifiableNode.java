package de.dfki.cos.basys.aas.knowledgegraph.model;

import lombok.*;
import org.eclipse.basyx.submodel.metamodel.api.qualifier.IIdentifiable;
import org.springframework.data.neo4j.core.schema.Node;

@Node("Identifiable")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class IdentifiableNode extends ReferableNode {

    private String id;

    public IdentifiableNode(IIdentifiable identifiable) {
        super(identifiable);
        this.id = identifiable.getIdentification().getId();
    }
}
