package de.dfki.cos.basys.aas.services;

import java.io.FileInputStream;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.eclipse.basyx.aas.registration.api.IAASRegistry;
import org.eclipse.basyx.aas.registration.proxy.AASRegistryProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.dfki.cos.basys.aas.component.AasComponentContext;
import de.dfki.cos.basys.common.component.ComponentException;
import de.dfki.cos.basys.common.component.StringConstants;
import de.dfki.cos.basys.common.component.manager.impl.ComponentManagerImpl;

public class Main {

	public static Logger LOGGER = LoggerFactory.getLogger("Main");
	
	public static String service = "registry|aggregator|container";

	/*
	 * Repository
	 */
	
	private static ComponentManagerImpl componentManager;

	private static Properties componentManagerConfig = new Properties();
	private static Properties aasRegistryConfig = new Properties(AasRegistryComponent.getDefaultConfig());
	private static Properties aasAggregatorConfig = new Properties(AasAggregatorComponent.getDefaultConfig());
	private static Properties servletContainerConfig = new Properties(ServletContainerComponent.getDefaultConfig());

	private static String aasRegistryEndpoint = "http://localhost:4999";
	
	private static AasComponentContext context = AasComponentContext.getStaticContext();
	
	private static String configFolderPath = "config/";
			
	protected static void printClassPath() {
		ClassLoader cl = ClassLoader.getSystemClassLoader();

        URL[] urls = ((URLClassLoader)cl).getURLs();

        System.out.println("####################################################");
        System.out.println("");
        for(URL url: urls){
        	System.out.println(url.getFile());
        }
        System.out.println("");
        System.out.println("####################################################");
	}
	
	public static void main(String[] args) throws Exception {	
		
		Options options = new Options();

		Option helpOption = new Option("cp", "classpath", false, "print classpath and exit");
		helpOption.setRequired(false);
		options.addOption(helpOption);

		Option serviceOption = new Option("s", "service", true, "can be 'registry', 'aggregator', and/or 'container' separated by '|', default 'registry|aggregator|container'");
		serviceOption.setRequired(false);
		options.addOption(serviceOption);
		
		Option zkOption = new Option("zk", "zookeeper", true, "the Zookeeper connection string for the registry service, default 'localhost:2181'");
		zkOption.setRequired(false);		
		options.addOption(zkOption);

		Option aarRegistryOption = new Option("r", "aas-registry", true, "the AAS registry rest endpoint for the container service, default '"  + aasRegistryEndpoint + "'");
		aarRegistryOption.setRequired(false);
		options.addOption(aarRegistryOption);
		
		Option configFileOption = new Option("c", "config", true, "path to a config folder");
		configFileOption.setRequired(false);
		options.addOption(configFileOption);

		Option certsFolderOption = new Option("xf", "certsFolder", true, "folder containing server and client certificates");
		certsFolderOption.setRequired(false);
		options.addOption(certsFolderOption);

		Option componentsFolderOption = new Option("cf", "componentConfigFolder", true, "folder containing component configurations");
		componentsFolderOption.setRequired(false);
		options.addOption(componentsFolderOption);


		CommandLineParser parser = new DefaultParser();
		HelpFormatter formatter = new HelpFormatter();
		CommandLine cmd;			 
		
		try {
			cmd = parser.parse(options, args);
			
			if (cmd.hasOption("x")) {
				printClassPath();
				System.exit(0);
			}
			
			if (cmd.hasOption("s")) { 
				service = cmd.getOptionValue("s");
			}
			
			if (cmd.hasOption("c")) {
				configFolderPath = cmd.getOptionValue("c");
			}
			
//			Path componentRegistryConfigPath = Paths.get(configFolderPath, "component-registry.properties");
//			if (componentRegistryConfigPath.toFile().exists()) {
//				componentRegistryConfig.load(new FileInputStream(componentRegistryConfigPath.toFile()));
//			} else {
//				LOGGER.warn("component-registry.properties not found in " + componentRegistryConfigPath.toFile() + ". Using defaults.");
//			}

			Path componentManagerConfigPath = Paths.get(configFolderPath, "component-manager.properties");
			if (componentManagerConfigPath.toFile().exists()) {
				componentManagerConfig.load(new FileInputStream(componentManagerConfigPath.toFile()));		
				LOGGER.info("component-manager.properties loaded: " + componentManagerConfigPath.toFile());
			} else {
				LOGGER.warn("component-manager.properties not found in " + componentManagerConfigPath.toFile() + ". Using defaults.");
			}

			Path aasRegistryConfigPath = Paths.get(configFolderPath, "aas-registry.properties");
			if (aasRegistryConfigPath.toFile().exists()) {
				aasRegistryConfig.load(new FileInputStream(aasRegistryConfigPath.toFile()));		
				LOGGER.info("aas-registry.properties loaded: " + aasRegistryConfigPath.toFile());
			} else {
				LOGGER.warn("aas-registry.properties not found in " + aasRegistryConfigPath.toFile() + ". Using defaults.");
			}

			Path aasAggregatorConfigPath = Paths.get(configFolderPath, "aas-aggregator.properties");
			if (aasAggregatorConfigPath.toFile().exists()) {
				aasAggregatorConfig.load(new FileInputStream(aasAggregatorConfigPath.toFile()));	
				LOGGER.info("aas-aggregator.properties loaded: " + aasAggregatorConfigPath.toFile());	
			} else {
				LOGGER.warn("aas-aggregator.properties not found in " + aasAggregatorConfigPath.toFile() + ". Using defaults.");
			}
			
			Path servletContainerConfigPath = Paths.get(configFolderPath, "servlet-container.properties");
			if (servletContainerConfigPath.toFile().exists()) {
				servletContainerConfig.load(new FileInputStream(servletContainerConfigPath.toFile()));
				LOGGER.info("servlet-container.properties loaded: " + servletContainerConfigPath.toFile());
			} else {
				LOGGER.warn("servlet-container.properties not found in " + servletContainerConfigPath.toFile() + ". Using defaults.");
			}
			
			

			if (cmd.hasOption("cf")) {
				componentManagerConfig.setProperty(StringConstants.serviceConnectionString, cmd.getOptionValue("cf"));
			} else {
				componentManagerConfig.setProperty(StringConstants.serviceConnectionString, "components/");
			}

			if (cmd.hasOption("zk")) {
				aasRegistryConfig.setProperty(StringConstants.serviceConnectionString, cmd.getOptionValue("zk"));			
			}
			
			if (cmd.hasOption("r")) {
				aasRegistryEndpoint = cmd.getOptionValue("r");
			}
			
		} catch (ParseException e) {
			System.out.println(e.getMessage());
			formatter.printHelp("utility-name", options);

			System.exit(1);
		}		
		
		
		// 0. create AAS registry client
		IAASRegistry aasRegistry = new AASRegistryProxy(aasRegistryEndpoint);
		context.setAasRegistry(aasRegistry);
		
		// 1. create component manager
		componentManager = new ComponentManagerImpl(componentManagerConfig);
		context.setComponentManager(componentManager);

		// 2. create the desired components
		AasRegistryComponent registry = null;
		if (service.contains("registry")) {
			registry = new AasRegistryComponent(aasRegistryConfig);
			registry.activate(context);
		}

		AasAggregatorComponent aggregator = null;
		if (service.contains("aggregator")) {
			aggregator = new AasAggregatorComponent(aasAggregatorConfig);
			aggregator.activate(context);
		}		

		ServletContainerComponent servletContainer = null;
		if (service.contains("container")) {
			servletContainer = new ServletContainerComponent(servletContainerConfig);
			servletContainer.activate(context);		
		}		
		
		// 3. create component registry		
		//Component componentRegistry = componentManager.createComponent(componentRegistryConfig);
		//componentRegistry.activate(context);
		//context.setComponentRegistry( (ComponentRegistry) componentRegistry);
		
		// 4. activate the component manager --> loads all aas components
		componentManager.activate(context);		
		if (registry != null)
			componentManager.addComponent(registry);
		if (aggregator != null)
			componentManager.addComponent(aggregator);		
		if (servletContainer != null)
			componentManager.addComponent(servletContainer);

		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				LOGGER.info("Shutdown hook ran!");
				try {
					if (componentManager != null)
						componentManager.deactivate();
				} catch (ComponentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

	}


}
