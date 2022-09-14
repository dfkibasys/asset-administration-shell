package de.dfki.cos.basys.aas.event;

import org.eclipse.basyx.submodel.metamodel.api.reference.IReference;

public interface IEventMessage {

	IReference getSource();

	IReference getSourceSemanticId();

	IReference getObservableReference();

	IReference getObservableSemanticId();

	String getTopic();

	String getSubject();

	String getTimestamp();

	String getPayload();
}
