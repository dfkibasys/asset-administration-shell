package de.dfki.cos.basys.aas.event;

import org.eclipse.basyx.submodel.metamodel.api.reference.enums.KeyElements;
import org.eclipse.basyx.submodel.metamodel.enumhelper.StandardizedLiteralEnum;
import org.eclipse.basyx.submodel.metamodel.enumhelper.StandardizedLiteralEnumHelper;

public enum EventState implements StandardizedLiteralEnum {
	
	ON("On"),
	OFF("Off");	

	private String standardizedLiteral;

	private EventState(String standardizedLiteral) {
		this.standardizedLiteral = standardizedLiteral;
	}

	@Override
	public String getStandardizedLiteral() {
		return standardizedLiteral;
	}

	@Override
	public String toString() {
		return standardizedLiteral;
	}

	public static EventState fromString(String str) {
		return StandardizedLiteralEnumHelper.fromLiteral(EventState.class, str);
	}
}