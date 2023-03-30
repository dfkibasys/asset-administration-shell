package de.dfki.cos.basys.aas.knowledgegraph.model;

import lombok.*;
import org.eclipse.basyx.submodel.metamodel.api.qualifier.IReferable;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node("Referable")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class ReferableNode {

    @Id
    @GeneratedValue
    protected Long neo4jId;

    private String idShort;
    private String sourceUrl;

    public ReferableNode(IReferable referable) {
        this.idShort = referable.getIdShort();
    }

}

