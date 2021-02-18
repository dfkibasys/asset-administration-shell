package de.dfki.cos.basys.aas.event.mqtt;

import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.paho.client.mqttv3.IMqttActionListener;
import org.eclipse.paho.client.mqttv3.IMqttAsyncClient;
import org.eclipse.paho.client.mqttv3.IMqttToken;
import org.eclipse.paho.client.mqttv3.MqttAsyncClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.GsonBuilder;

import de.dfki.cos.basys.aas.event.IEventMessage;
import de.dfki.cos.basys.aas.event.IEventTransmitter;
import de.dfki.cos.basys.common.component.ComponentContext;
import de.dfki.cos.basys.common.component.ServiceProvider;

public class MqttEventTransmitter implements IEventTransmitter, ServiceProvider<IEventTransmitter> {
	
	private static final Logger LOG = LoggerFactory.getLogger(MqttEventTransmitter.class);
	private static final String CONNECTION_STRING_PATTERN = "tcp:\\/\\/(?<host>.*):(?<port>\\d*)";
	
	
	private static final String PREFIX = "MqttAsyncClient-paho-v3";
	private static final Integer QOS = 0;
	IMqttAsyncClient mqttClient = null;
	String clientId = null;
	
	ObjectMapper objectMapper = new ObjectMapper();
	
	public MqttEventTransmitter() {
		clientId = PREFIX + UUID.randomUUID().toString();
	}
	
	@Override
	public boolean connect(ComponentContext context, String connectionString) {
		
		Pattern pattern = Pattern.compile(CONNECTION_STRING_PATTERN);
		Matcher matcher = pattern.matcher(connectionString);
		if(matcher.matches()) {
			//do nothing
		}
		else {
			LOG.error("Invalid or malformed service connection string! {} does not match "
					+ "the expected pattern {}! Connection failed! ",
					connectionString, CONNECTION_STRING_PATTERN);
			return false;
		}
		
		
		
		MemoryPersistence persistence = new MemoryPersistence();
		final MqttConnectOptions options = new MqttConnectOptions();

		options.setCleanSession(true);
		try {
			mqttClient = new MqttAsyncClient(connectionString, clientId, persistence);
		} catch (MqttException e) {
			LOG.error("Generation of MqttAsyncClient failed wih {}!", e);
			return false;
		}
		
		try {
			mqttClient.connect(options, new IMqttActionListener() {
				@Override
				public void onSuccess(IMqttToken asyncActionToken) {
					LOG.debug(clientId + " successfully connected to {}.", connectionString);		
				}
				
				@Override
				public void onFailure(IMqttToken asyncActionToken, Throwable exception) {
					LOG.warn(clientId + " could not establish connection to {}!", connectionString);
				}
			}).waitForCompletion();
		} catch (MqttException e) {
			LOG.error("Estalishing connection to {} failed with {}!", connectionString, e);
			return false;
		}

		return true;
	}

	@Override
	public void disconnect() {
		try {
			mqttClient.disconnect().waitForCompletion();
		} catch (MqttException e) {
			LOG.warn(clientId + " failed to disconnect with {}!", e);
		}		
	}

	@Override
	public boolean isConnected() {
		return mqttClient == null ? false : mqttClient.isConnected();
	}


	@Override
	public IEventTransmitter getService() {
		return this;
	}
	
	@Override
	public void sendEventMessage(IEventMessage message) {
		String json = "{}";
		try {
			json = objectMapper.writeValueAsString(message);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			json = "{\"error\":\"" + e.getMessage() + "\"}";
		}		
		publish(message.getTopic(), json);
		
		
		//publish(message.getTopic(), message.getPayload());
	}

	private void publish(String topic, String content) {
		final MqttMessage message = new MqttMessage(content.getBytes());
        message.setQos(QOS);
        try {
        	mqttClient.publish(topic, message).waitForCompletion();
        	LOG.debug("publishing message {} on topic {}", message, topic);
        } catch (MqttException e) {
        	LOG.error("Failed to publish message {} on topic {} with {}", message, topic, e);
        	e.printStackTrace();
        }
	}

}
