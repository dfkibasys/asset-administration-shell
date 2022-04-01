package de.dfki.cos.basys.aas.event.impl;

import java.time.Duration;
import java.time.Instant;
import java.util.Map;

import org.eclipse.basyx.submodel.metamodel.api.identifier.IdentifierType;
import org.eclipse.basyx.submodel.metamodel.api.reference.IReference;
import org.eclipse.basyx.submodel.metamodel.api.reference.enums.KeyElements;
import org.eclipse.basyx.submodel.metamodel.api.reference.enums.KeyType;
import org.eclipse.basyx.submodel.metamodel.map.modeltype.ModelType;
import org.eclipse.basyx.submodel.metamodel.map.qualifier.LangStrings;
import org.eclipse.basyx.submodel.metamodel.map.qualifier.Referable;
import org.eclipse.basyx.submodel.metamodel.map.reference.Key;
import org.eclipse.basyx.submodel.metamodel.map.reference.Reference;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.SubmodelElementCollection;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.dataelement.property.Property;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.event.BasicEvent;

import de.dfki.cos.basys.aas.event.EventDirection;
import de.dfki.cos.basys.aas.event.EventState;
import de.dfki.cos.basys.aas.event.IExtendedEvent;

public class ExtendedEvent extends BasicEvent implements IExtendedEvent {

	//public static final String MODELTYPE = "ExtendedEvent";
	
	//FIXME: This is the correct name of the attribute according to DAAS. To be renamed in BasicEvent.
	//public static final String OBSERVABLE_REFERENCE = "observableReference";
	
	public static final String DIRECTION = "direction";
	public static final String STATE = "state";

	public static final String MESSAGE_TOPIC = "messageTopic";
	public static final String MESSAGE_BROKER = "messageBroker";

	public static final String LAST_UPDATE = "lastUpdate";
	public static final String MIN_INTERVAL = "minInterval";
	public static final String MAX_INTERVAL = "maxInterval";
	
	
	public ExtendedEvent() {
		//// Add model type
		//putAll(new ModelType(MODELTYPE));
		super();
	}
	
	public ExtendedEvent(IReference observed, EventDirection direction, EventState state, String messageTopic, IReference messageBroker) {
		//this();
		//put(OBSERVED, observed);
		super(observed);
		put(DIRECTION, direction.toString());
		put(STATE, state.toString());
		put(MESSAGE_TOPIC, messageTopic);
		put(MESSAGE_BROKER, messageBroker);
		
		//TODO: we don't use lastUpdate, minInterval, maxInterval so far
	}	
	
	public ExtendedEvent(IReference observed, EventDirection direction, EventState state, String messageTopic, String messageBrokerConfigIdShort) {
		//this();
		//put(OBSERVED, observed);
		super(observed);
		put(DIRECTION, direction.toString());
		put(STATE, state.toString());
		put(MESSAGE_TOPIC, messageTopic);				
		put(MESSAGE_BROKER, new Reference(new Key(KeyElements.SUBMODELELEMENTCOLLECTION, true, messageBrokerConfigIdShort, KeyType.IDSHORT)));
		
		//TODO: we don't use lastUpdate, minInterval, maxInterval so far
	}	
	
	/**
	 * Creates a ExtendedEvent object from a map
	 * 
	 * @param obj a ExtendedEvent object as raw map
	 * @return a ExtendedEvent object, that behaves like a facade for the given map
	 */
	public static ExtendedEvent createAsFacade(Map<String, Object> obj) {
		ExtendedEvent facade = new ExtendedEvent();
		facade.setMap(obj);
		return facade;
	}
	
	/**
	 * Returns true if the given submodel element map is recognized as an ExtendedEvent element
	 */
	public static boolean isExtendedEvent(Map<String, Object> map) {
		String modelType = ModelType.createAsFacade(map).getName();
		// Either model type is set or the element type specific attributes are contained (fallback)
		return MODELTYPE.equals(modelType) 
				|| (map.containsKey(OBSERVED) && map.containsKey(DIRECTION) && map.containsKey(STATE) && map.containsKey(MESSAGE_BROKER) && map.containsKey(MESSAGE_TOPIC));
	}
	
	@Override
	public EventDirection getDirection() {
		return EventDirection.fromString((String)get(DIRECTION));	
	}

	@Override
	public EventState getState() {
		return EventState.fromString((String)get(STATE));	
	}

	@Override
	public String getMessageTopic() {
		return (String) get(MESSAGE_TOPIC);		
	}

	@Override
	@SuppressWarnings("unchecked")
	public IReference getMessageBroker() {
		return Reference.createAsFacade((Map<String, Object>) get(MESSAGE_BROKER));
	}
	
	public void setMessageBroker(IReference ref) {
		put(MESSAGE_BROKER, ref);
	}

	@Override
	public Instant getLastUpdate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Duration getMinInterval() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Duration getMaxInterval() {
		// TODO Auto-generated method stub
		return null;
	}

}
