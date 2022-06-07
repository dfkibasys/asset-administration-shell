package de.dfki.cos.basys.aas.server.util;

import java.util.List;

import org.eclipse.basyx.aas.metamodel.map.descriptor.AASDescriptor;
import org.eclipse.basyx.aas.metamodel.map.descriptor.SubmodelDescriptor;
import org.eclipse.basyx.aas.registration.api.IAASRegistry;
import org.eclipse.basyx.submodel.metamodel.api.identifier.IIdentifier;
import org.eclipse.basyx.vab.exception.provider.ProviderException;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RetryableAasRegistryDecorator implements IAASRegistry {

	private final IAASRegistry registry;

	@Override
	@Retryable(value = { ProviderException.class }, maxAttemptsExpression = "${basys.aas-registry.service.retry.maxAttemps}", backoff = @Backoff(delayExpression = "${basys.aas-registry.service.retry.delay}"))
	public void register(AASDescriptor deviceAASDescriptor) throws ProviderException {
		this.registry.register(deviceAASDescriptor);
	}

	@Override
	@Retryable(value = { ProviderException.class }, maxAttemptsExpression = "${basys.aas-registry.service.retry.maxAttemps}", backoff = @Backoff(delayExpression = "${basys.aas-registry.service.retry.delay}"))
	public void register(IIdentifier aas, SubmodelDescriptor smDescriptor) throws ProviderException {
		this.registry.register(aas, smDescriptor);
	}

	@Override
	@Retryable(value = { ProviderException.class }, maxAttemptsExpression = "${basys.aas-registry.service.retry.maxAttemps}", backoff = @Backoff(delayExpression = "${basys.aas-registry.service.retry.delay}"))
	public void delete(IIdentifier aasId) throws ProviderException {
		this.registry.delete(aasId);
	}

	@Override
	@Retryable(value = { ProviderException.class }, maxAttemptsExpression = "${basys.aas-registry.service.retry.maxAttemps}", backoff = @Backoff(delayExpression = "${basys.aas-registry.service.retry.delay}"))
	public void delete(IIdentifier aasId, IIdentifier smId) throws ProviderException {
		this.registry.delete(aasId, smId);
	}

	@Override
	@Retryable(value = { ProviderException.class }, maxAttemptsExpression = "${basys.aas-registry.service.retry.maxAttemps}", backoff = @Backoff(delayExpression = "${basys.aas-registry.service.retry.delay}"))
	public AASDescriptor lookupAAS(IIdentifier aasId) throws ProviderException {
		return this.registry.lookupAAS(aasId);
	}

	@Override
	@Retryable(value = { ProviderException.class }, maxAttemptsExpression = "${basys.aas-registry.service.retry.maxAttemps}", backoff = @Backoff(delayExpression = "${basys.aas-registry.service.retry.delay}"))
	public List<AASDescriptor> lookupAll() throws ProviderException {
		return this.registry.lookupAll();
	}

	@Override
	@Retryable(value = { ProviderException.class }, maxAttemptsExpression = "${basys.aas-registry.service.retry.maxAttemps}", backoff = @Backoff(delayExpression = "${basys.aas-registry.service.retry.delay}"))
	public List<SubmodelDescriptor> lookupSubmodels(IIdentifier aasId) throws ProviderException {
		return this.registry.lookupSubmodels(aasId);
	}

	@Override
	@Retryable(value = { ProviderException.class }, maxAttemptsExpression = "${basys.aas-registry.service.retry.maxAttemps}", backoff = @Backoff(delayExpression = "${basys.aas-registry.service.retry.delay}"))
	public SubmodelDescriptor lookupSubmodel(IIdentifier aasId, IIdentifier smId) throws ProviderException {
		return this.registry.lookupSubmodel(aasId, smId);
	}
}