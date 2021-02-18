package de.dfki.cos.basys.aas.component.impl;

import java.util.Properties;
import java.util.function.Supplier;

import com.google.common.eventbus.Subscribe;

import de.dfki.cos.basys.aas.event.IEventMessage;
import de.dfki.cos.basys.aas.event.IEventTransmitter;
import de.dfki.cos.basys.common.component.ServiceProvider;
import de.dfki.cos.basys.common.component.impl.ServiceComponent;

public class EventTransmitterComponent extends ServiceComponent<IEventTransmitter> {

	public EventTransmitterComponent(Properties config) {
		super(config);
	}
	
	public EventTransmitterComponent(Properties config, ServiceProvider<IEventTransmitter> serviceProvider) {
		super(config, serviceProvider);
	}
	
	public EventTransmitterComponent(Properties config,
			Supplier<ServiceProvider<IEventTransmitter>> serviceProviderSupplier) {
		super(config, serviceProviderSupplier);
	}

	@Subscribe
	public void onEventMessage(IEventMessage message) {
		getService().sendEventMessage(message);
	} 
}
