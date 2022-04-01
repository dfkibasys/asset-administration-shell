package de.dfki.cos.basys.aas.event.impl;

import org.eclipse.basyx.submodel.metamodel.api.reference.IReference;

import de.dfki.cos.basys.aas.event.IEventMessage;
import javax.annotation.Generated;

public class EventMessage implements IEventMessage {

	IReference source;
	IReference sourceSemanticId;
	IReference observableReference;
	IReference observableSemanticId;
	String topic;
	String subject;
	String timestamp;
	String payload;

	@Generated("SparkTools")
	private EventMessage(Builder builder) {
		this.source = builder.source;
		this.sourceSemanticId = builder.sourceSemanticId;
		this.observableReference = builder.observableReference;
		this.observableSemanticId = builder.observableSemanticId;
		this.topic = builder.topic;
		this.subject = builder.subject;
		this.timestamp = builder.timestamp;
		this.payload = builder.payload;
	}

	public IReference getSource() {
		return source;
	}

	public void setSource(IReference source) {
		this.source = source;
	}

	public IReference getSourceSemanticId() {
		return sourceSemanticId;
	}

	public void setSourceSemanticId(IReference sourceSemanticId) {
		this.sourceSemanticId = sourceSemanticId;
	}

	public IReference getObservableReference() {
		return observableReference;
	}

	public void setObservableReference(IReference observableReference) {
		this.observableReference = observableReference;
	}

	public IReference getObservableSemanticId() {
		return observableSemanticId;
	}

	public void setObservableSemanticId(IReference observableSemanticId) {
		this.observableSemanticId = observableSemanticId;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getPayload() {
		return payload;
	}

	public void setPayload(String payload) {
		this.payload = payload;
	}

	/**
	 * Creates builder to build {@link EventMessage}.
	 * @return created builder
	 */
	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link EventMessage}.
	 */
	@Generated("SparkTools")
	public static final class Builder {
		private IReference source;
		private IReference sourceSemanticId;
		private IReference observableReference;
		private IReference observableSemanticId;
		private String topic;
		private String subject;
		private String timestamp;
		private String payload;

		private Builder() {
		}

		public Builder withSource(IReference source) {
			this.source = source;
			return this;
		}

		public Builder withSourceSemanticId(IReference sourceSemanticId) {
			this.sourceSemanticId = sourceSemanticId;
			return this;
		}

		public Builder withObservableReference(IReference observableReference) {
			this.observableReference = observableReference;
			return this;
		}

		public Builder withObservableSemanticId(IReference observableSemanticId) {
			this.observableSemanticId = observableSemanticId;
			return this;
		}

		public Builder withTopic(String topic) {
			this.topic = topic;
			return this;
		}

		public Builder withSubject(String subject) {
			this.subject = subject;
			return this;
		}

		public Builder withTimestamp(String timestamp) {
			this.timestamp = timestamp;
			return this;
		}

		public Builder withPayload(String payload) {
			this.payload = payload;
			return this;
		}

		public EventMessage build() {
			return new EventMessage(this);
		}
	}
	
	

}
