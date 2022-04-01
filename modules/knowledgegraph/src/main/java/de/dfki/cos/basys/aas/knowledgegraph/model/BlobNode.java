package de.dfki.cos.basys.aas.knowledgegraph.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.Node;

@Node("Blob")
@Getter
@Setter
public class BlobNode extends SubmodelElementNode {

    public BlobNode(String idShort, String semanticId) {
        super(idShort, semanticId);
    }
}
