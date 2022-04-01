package de.dfki.cos.basys.aas.knowledgegraph.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node("File")
@Getter
@Setter
public class FileNode extends SubmodelElementNode {

    private String mimeType;
    private String value;

    public FileNode(String idShort, String semanticId) {
        super(idShort, semanticId);
    }
}
