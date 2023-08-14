package de.dfki.cos.basys.aas.knowledgegraph.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.dataelement.IFile;
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
