package de.dfki.cos.basys.aas.knowledgegraph.model;

import lombok.*;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.dataelement.IFile;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node("File")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class FileNode extends SubmodelElementNode {

    private String mimeType;
    private String value;

    public FileNode(IFile file) {
        super(file);
        setMimeType(file.getMimeType());
        setValue(file.getValue());
    }
}
