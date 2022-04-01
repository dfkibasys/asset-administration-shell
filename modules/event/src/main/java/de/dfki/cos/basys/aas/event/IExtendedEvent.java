package de.dfki.cos.basys.aas.event;

import java.time.Duration;
import java.time.Instant;

import org.eclipse.basyx.submodel.metamodel.api.reference.IReference;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.event.IBasicEvent;


//according to DAAS, part 1, v3.0rc01, p. 43ff.
public interface IExtendedEvent extends IBasicEvent {

	EventDirection getDirection();

	EventState getState();

	String getMessageTopic();

	IReference getMessageBroker();

	Instant getLastUpdate();

	// FIXME: DAAS talks about frequency but specifies xsd:dateTime as type
	Duration getMinInterval();

	// FIXME: DAAS talks about frequency but specifies xsd:dateTime as type
	Duration getMaxInterval();
}
