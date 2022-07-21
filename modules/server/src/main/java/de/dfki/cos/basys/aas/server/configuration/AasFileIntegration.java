package de.dfki.cos.basys.aas.server.configuration;

import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PreDestroy;

import org.eclipse.basyx.aas.aggregator.api.IAASAggregator;
import org.eclipse.basyx.aas.metamodel.api.IAssetAdministrationShell;
import org.eclipse.basyx.aas.metamodel.map.descriptor.AASDescriptor;
import org.eclipse.basyx.aas.registration.api.IAASRegistry;
import org.eclipse.basyx.submodel.metamodel.api.identifier.IIdentifier;
import org.eclipse.basyx.submodel.metamodel.api.identifier.IdentifierType;
import org.eclipse.basyx.submodel.metamodel.map.identifier.Identifier;
import org.eclipse.basyx.support.bundle.AASBundle;
import org.eclipse.basyx.support.bundle.AASBundleHelper;
import org.eclipse.basyx.vab.exception.provider.ProviderException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.core.MessageSource;
import org.springframework.integration.file.FileHeaders;
import org.springframework.integration.file.FileReadingMessageSource;
import org.springframework.integration.file.FileReadingMessageSource.WatchEventType;
import org.springframework.integration.file.filters.AcceptAllFileListFilter;
import org.springframework.integration.file.filters.ChainFileListFilter;
import org.springframework.integration.file.filters.FileListFilter;
import org.springframework.integration.file.filters.RegexPatternFileListFilter;
import org.springframework.integration.file.filters.ResettableFileListFilter;
import org.springframework.integration.support.DefaultMessageBuilderFactory;
import org.springframework.integration.support.MessageBuilderFactory;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;

import de.dfki.cos.basys.aas.server.service.AasBundleService;
import de.dfki.cos.basys.aas.server.service.AasFileStorage;
import de.dfki.cos.basys.aas.server.service.DescriptorLoader;
import de.dfki.cos.basys.aas.server.service.FilePathUpdateService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Configuration
@EnableIntegration
@Slf4j
public class AasFileIntegration {

	@Value("${basys.aas-server.source}")
	private String sourcePath;

	@Value("${basys.aas-server.recursive}")
	private boolean recursive;

	@Value("${basys.aas-server.file-suffixes}")
	private String fileSuffixes;

	@Autowired
	private AasFileStorage storage;

	@Autowired
	private FilePathUpdateService filePathUpdater;

	@Autowired
	private AasBundleService bundleService;

	@Autowired
	private IAASAggregator aasAggregator;

	@Autowired
	private IAASRegistry aasRegistry;

	@Autowired
	private DescriptorLoader descriptorLoader;

	@Bean
	public MessageChannel aasxFileUpdateChannel() {
		return newFileInputChannel();
	}

	@Bean
	public MessageChannel aasxFileRemovalChannel() {
		return newFileInputChannel();
	}

	private MessageChannel newFileInputChannel() {
		DirectChannel channel = new DirectChannel();
		channel.setDatatypes(File.class);
		return channel;
	}

	@Bean
	@InboundChannelAdapter(value = "aasxFileUpdateChannel")
	public MessageSource<File> aasxFileMessageSource() {
		File directory = new File(sourcePath);
		FileReadingMessageSource sourceReader = new FileReadingMessageSource();
		sourceReader.setDirectory(directory);
		sourceReader.setUseWatchService(true);
		sourceReader.setWatchEvents(WatchEventType.DELETE, WatchEventType.CREATE, WatchEventType.MODIFY);

		String filePatternString = filePattern();
		Pattern pattern = Pattern.compile(filePatternString);
		RegexPatternFileListFilter regexFilter = new RegexPatternFileListFilter(pattern);
		FileRemovalNotificationFilter removalNotification = new FileRemovalNotificationFilter(aasxFileRemovalChannel(), directory, pattern);

		List<FileListFilter<File>> filters = List.of(regexFilter, removalNotification);
		sourceReader.setFilter(new ChainFileListFilter<>(filters));

		return sourceReader;
	}

	private String filePattern() {
		String filePattern = getFileSuffixPattern();
		String patternPrefix = recursive ? "^.*\\." : "^[\\/]?[^\\\\/]*\\.";
		return patternPrefix + filePattern + "$";
	}

	private String getFileSuffixPattern() {
		return Stream.of(fileSuffixes.split(" ")).map(this::removeTrailingPoint).collect(Collectors.joining("|", "(", ")"));
	}

	private String removeTrailingPoint(String suffix) {
		return suffix.startsWith(".") ? suffix.substring(1) : suffix;
	}

	@ServiceActivator(inputChannel = "aasxFileUpdateChannel")
	public void fileUpdated(@Payload File file, @Header(FileHeaders.RELATIVE_PATH) String relativePath) {
		log.info("File updated " + relativePath);
		Collection<AASBundle> bundles = bundleService.loadAASFromSource(file.getAbsolutePath());
		String[] newIds = bundles.stream().map(AASBundle::getAAS).map(IAssetAdministrationShell::getIdentification).map(IIdentifier::getId).collect(Collectors.toList()).toArray(new String[0]);
		String[] oldIds = storage.replace(relativePath, newIds);

		unregisterBundlesByIds(oldIds);
		registerBundles(bundles);
	}

	private void registerBundles(Collection<AASBundle> bundles) {
		bundles.stream().parallel().forEach(this::registerBundle);
	}

	private void registerBundle(AASBundle bundle) {
		try {
			filePathUpdater.modifyFilePaths(bundle);
			AASBundleHelper.integrate(aasAggregator, List.of(bundle));
	
			AASDescriptor descriptor = descriptorLoader.retrieveDescriptor(bundle);
			aasRegistry.register(descriptor);
		} catch (ProviderException ex) {
			log.error("Failed to access aas-registry!", ex);
			log.error("Descriptor " + bundle.getAAS().getIdentification().getId() + " not registered!");
		}
	}

	@ServiceActivator(inputChannel = "aasxFileRemovalChannel")
	public void fileRemoved(@Payload File file, @Header(FileHeaders.RELATIVE_PATH) String relativePath) {
		log.info("File removed " + relativePath);
		String[] ids = storage.remove(relativePath);
		unregisterBundlesByIds(ids);
	}

	private void unregisterBundlesByIds(String[] ids) {
		Stream.of(ids).parallel().forEach(this::unregisterBundleById);
	}

	private void unregisterBundleById(String id) {
		Identifier identifier = new Identifier(IdentifierType.CUSTOM, id);
		aasAggregator.deleteAAS(identifier);
		aasRegistry.delete(identifier);
	}

	@PreDestroy
	public void unregisterAndStopMonitoring() {
		log.info("unregisterAndStopMonitoring");
		String[] ids = storage.listIds();
		unregisterBundlesByIds(ids);
	}

	@RequiredArgsConstructor
	private static final class FileRemovalNotificationFilter extends AcceptAllFileListFilter<File> implements ResettableFileListFilter<File> {

		private final MessageChannel removalChannel;
		private final File directory;
		private final Pattern pattern;
		private final MessageBuilderFactory messageBuilderFactory = new DefaultMessageBuilderFactory();

		@Override
		public boolean remove(File file) {
			String path = file.getAbsolutePath();
			if (pattern.matcher(path).find()) {
				String relativePath = path.replaceFirst(Matcher.quoteReplacement(directory.getAbsolutePath() + File.separator), "");
				Message<File> msg = messageBuilderFactory.withPayload(file).setHeader(FileHeaders.RELATIVE_PATH, relativePath).build();
				removalChannel.send(msg);
				return true;
			}
			return false;
		}
	}
}