package de.dfki.cos.basys.aas.knowledgegraph.model;

import lombok.*;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.dataelement.IProperty;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.dataelement.property.valuetype.ValueType;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;


@Node("Property")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PropertyNode extends SubmodelElementNode {

	private ValueType valueType;
	private Object value;

	public PropertyNode(IProperty property) {
		super(property);
		setValueType(property.getValueType());

		if (property.getValue() != null) {
			try {
				setValue(property.getValue());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
