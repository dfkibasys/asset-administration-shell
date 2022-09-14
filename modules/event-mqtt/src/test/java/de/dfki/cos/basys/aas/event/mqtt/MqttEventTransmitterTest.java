package de.dfki.cos.basys.aas.event.mqtt;

import static org.junit.Assert.*;

import java.time.Instant;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import de.dfki.cos.basys.aas.event.impl.EventMessage;

public class MqttEventTransmitterTest {

	String connectionString = "tcp://localhost:1883";
	String testTopic = "test_" + Instant.now().toString();
	MqttEventTransmitter transmitter = new MqttEventTransmitter();	
	EventMessage message;
	
	@Before
	public void setUp() throws Exception {
		message = EventMessage.builder().withPayload("payload").withSubject("subject").withTimestamp(Instant.now().toString()).withTopic(testTopic).build();		
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	@Ignore
	public void testConnectDisconnect() {
		assertFalse(transmitter.isConnected());
		transmitter.connect(null, connectionString);
		assertTrue(transmitter.isConnected());		
		transmitter.disconnect();
		assertFalse(transmitter.isConnected());
	}
	

	@Test
	@Ignore
	public void testSendMessage() {
		assertFalse(transmitter.isConnected());
		transmitter.connect(null, connectionString);
		assertTrue(transmitter.isConnected());	
		
		transmitter.sendEventMessage(message);		
		
		transmitter.disconnect();
		assertFalse(transmitter.isConnected());
	}

}
