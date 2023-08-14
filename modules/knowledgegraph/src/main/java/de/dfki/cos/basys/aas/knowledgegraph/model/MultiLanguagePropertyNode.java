package de.dfki.cos.basys.aas.knowledgegraph.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.dataelement.IMultiLanguageProperty;
import org.springframework.data.neo4j.core.schema.Node;


@Node("MultiLanguageProperty")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MultiLanguagePropertyNode extends SubmodelElementNode {

	public MultiLanguagePropertyNode(IMultiLanguageProperty property) {
		super(property);


	}

}
