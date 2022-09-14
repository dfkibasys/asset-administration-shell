package de.dfki.cos.basys.aas.knowledgegraph.model;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.dataelement.property.valuetype.ValueType;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;


@Node("Property")
@Getter
@Setter
public class PropertyNode extends SubmodelElementNode {

	private ValueType valueType;
	private Object value;

	public PropertyNode(String idShort, String semanticId) {
		super(idShort, semanticId);
	}

}
