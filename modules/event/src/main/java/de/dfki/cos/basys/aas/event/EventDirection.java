package de.dfki.cos.basys.aas.event;

import org.eclipse.basyx.submodel.metamodel.enumhelper.StandardizedLiteralEnum;
import org.eclipse.basyx.submodel.metamodel.enumhelper.StandardizedLiteralEnumHelper;

public enum EventDirection implements StandardizedLiteralEnum {
	
	INPUT("Input"),
	OUTPUT("Output");	

	private String standardizedLiteral;

	private EventDirection(String standardizedLiteral) {
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

	public static EventDirection fromString(String str) {
		return StandardizedLiteralEnumHelper.fromLiteral(EventDirection.class, str);
	}
}
