package de.dfki.cos.basys.aas.knowledgegraph.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.dataelement.IBlob;
import org.springframework.data.neo4j.core.schema.Node;

@Node("Blob")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BlobNode extends SubmodelElementNode {
    public BlobNode(IBlob blob) {
        super(blob);
    }

}
