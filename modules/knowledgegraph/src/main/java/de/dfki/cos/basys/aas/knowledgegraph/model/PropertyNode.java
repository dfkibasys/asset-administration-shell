package de.dfki.cos.basys.aas.knowledgegraph.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.dataelement.IProperty;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.dataelement.property.valuetype.ValueType;
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
				if (getValueType() == ValueType.Float)		{
					var val = property.getValue();
					setValue(Double.valueOf((float)val));
				} else {
					setValue(property.getValue());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
