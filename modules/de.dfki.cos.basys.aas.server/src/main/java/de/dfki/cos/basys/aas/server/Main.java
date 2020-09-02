/*
 * Copyright (c) 2019 the Eclipse Milo Authors
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */

package de.dfki.cos.basys.aas.server;

import java.io.FileInputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.concurrent.ExecutionException;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.slf4j.LoggerFactory;

import de.dfki.cos.basys.common.component.ComponentContext;
import de.dfki.cos.basys.common.component.ComponentException;
import de.dfki.cos.basys.common.component.manager.impl.ComponentManagerImpl;
import de.dfki.cos.basys.controlcomponent.server.aas.SubmodelHost;
import de.dfki.cos.basys.controlcomponent.server.opcua.ControlComponentServer;

public class Main {

	private static ControlComponentServer server;
	private static ComponentManagerImpl componentManager;
	private static SubmodelHost submodelHost;

	private static Properties serverConfig = new Properties(ControlComponentServer.getDefaultConfig());
	private static Properties submodelHostConfig = new Properties(SubmodelHost.getDefaultConfig());
	private static Properties componentManagerConfig = new Properties();

	public static void main(String[] args) throws Exception {		
		Options options = new Options();

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
			if (cmd.hasOption("c")) {
				String configFolderPath = cmd.getOptionValue("c");
		
				Path serverConfigPath = Paths.get(configFolderPath, "opcua-server.properties");
				serverConfig.load(new FileInputStream(serverConfigPath.toFile()));

				Path submodelHostConfigPath = Paths.get(configFolderPath, "submodel-host.properties");
				submodelHostConfig.load(new FileInputStream(submodelHostConfigPath.toFile()));

				Path componentManagerConfigPath = Paths.get(configFolderPath, "component-manager.properties");
				componentManagerConfig.load(new FileInputStream(componentManagerConfigPath.toFile()));							
			}

			if (cmd.hasOption("xf")) {
				serverConfig.setProperty("certsFolder", cmd.getOptionValue("xf"));
			}

			if (cmd.hasOption("cf")) {
				componentManagerConfig.setProperty("serviceConnectionString", cmd.getOptionValue("cf"));
			}

		} catch (ParseException e) {
			System.out.println(e.getMessage());
			formatter.printHelp("utility-name", options);

			System.exit(1);
		}

		server = new ControlComponentServer(serverConfig);
		server.startup().get();

		submodelHost = new SubmodelHost(submodelHostConfig);
		submodelHost.startup();

		componentManager = new ComponentManagerImpl(componentManagerConfig);
		componentManager.activate(ComponentContext.getStaticContext());

		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				System.out.println("Shutdown hook ran!");
				try {
					if (componentManager != null)
						componentManager.deactivate();
					if (submodelHost != null)
						submodelHost.shutdown();
					if (server != null)
						server.shutdown().get();
				} catch (ComponentException | InterruptedException | ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

	}

}
