/*
 * Copyright (c) 2019 the Eclipse Milo Authors
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */

package de.dfki.cos.basys.aas.registry.zookeeper;

import java.util.concurrent.ExecutionException;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.eclipse.basyx.aas.registration.memory.AASRegistry;
import org.eclipse.basyx.aas.registration.restapi.DirectoryModelProvider;
import org.eclipse.basyx.vab.protocol.http.server.AASHTTPServer;
import org.eclipse.basyx.vab.protocol.http.server.BaSyxContext;
import org.eclipse.basyx.vab.protocol.http.server.VABHTTPInterface;
import org.slf4j.LoggerFactory;

import de.dfki.cos.basys.common.component.ComponentContext;
import de.dfki.cos.basys.common.component.ComponentException;
import de.dfki.cos.basys.common.component.manager.impl.ComponentManagerImpl;

public class Main {

	private static ZookeeperRegistryHandler handler;
	private static AASRegistry registry;
	private static VABHTTPInterface<DirectoryModelProvider> servlet;	
	//private static Properties registryConfig = new Properties();

	// The server with the servlet that will be created
	private static AASHTTPServer server;

	private static String zkString = "localhost:2181";
	private static String hostString = "localhost";
	private static String portString = "8080";
	
	public static void main(String[] args) throws Exception {		
		Options options = new Options();


		Option zkOption = new Option("zk", "zookeeper", true, "the Zookeeper connection string, default " + zkString);
		zkOption.setRequired(false);
		options.addOption(zkOption);
		
		Option hostOption = new Option("h", "host", true, "the host's name or IP address, default " + hostString);
		hostOption.setRequired(false);
		options.addOption(hostOption);
		
		Option portOption = new Option("p", "port", true, "the host's port, default " + portString);
		portOption.setRequired(false);
		options.addOption(portOption);

		CommandLineParser parser = new DefaultParser();
		HelpFormatter formatter = new HelpFormatter();
		CommandLine cmd;			 
		
		try {
			cmd = parser.parse(options, args);
			if (cmd.hasOption("zk")) {
				zkString = cmd.getOptionValue("zk");
			}
			if (cmd.hasOption("h")) {
				hostString = cmd.getOptionValue("h");
			}
			if (cmd.hasOption("p")) {
				portString = cmd.getOptionValue("p");
			}

		} catch (ParseException e) {
			System.out.println(e.getMessage());
			formatter.printHelp("utility-name", options);

			System.exit(1);
		}

		handler = new ZookeeperRegistryHandler(zkString);
		registry = new AASRegistry(handler);
		servlet = new VABHTTPInterface<DirectoryModelProvider>(new DirectoryModelProvider(registry));
				
		BaSyxContext context = new BaSyxContext("/","", hostString, Integer.parseInt(portString));
		context.addServletMapping("/*", servlet);
		server = new AASHTTPServer(context);		

		//LOGGER.info("Start the server...");
		server.start();
		
		//http://localhost:8080/api/v1/registry/myAas2aasd
		
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				System.out.println("Shutdown hook ran!");				
				if (server != null)
					server.shutdown();					
				if (handler != null)
					handler.disconnect();			
			}
		});

	}

}
