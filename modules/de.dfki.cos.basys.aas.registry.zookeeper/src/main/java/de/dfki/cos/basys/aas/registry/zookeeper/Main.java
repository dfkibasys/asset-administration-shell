package de.dfki.cos.basys.aas.registry.zookeeper;

import java.net.URL;
import java.net.URLClassLoader;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.eclipse.basyx.aas.registration.memory.AASRegistry;
import org.eclipse.basyx.aas.registration.restapi.AASRegistryModelProvider;
import org.eclipse.basyx.vab.protocol.http.server.BaSyxContext;
import org.eclipse.basyx.vab.protocol.http.server.BaSyxHTTPServer;
import org.eclipse.basyx.vab.protocol.http.server.VABHTTPInterface;

public class Main {

	private static ZookeeperRegistryHandler handler;
	private static AASRegistry registry;
	private static VABHTTPInterface<AASRegistryModelProvider> servlet;	
	//private static Properties registryConfig = new Properties();

	// The server with the servlet that will be created
	private static BaSyxHTTPServer server;

	private static String zkString = "localhost:2181";
	private static String hostString = "localhost";
	private static String portString = "8080";
	
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
		
		Option helpOption = new Option("x", "help", false, "print class path");
		helpOption.setRequired(false);
		options.addOption(helpOption);

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
			
			if (cmd.hasOption("x")) {
				printClassPath();
				System.exit(0);
			}
			
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
		servlet = new VABHTTPInterface<AASRegistryModelProvider>(new AASRegistryModelProvider(registry));
				
		BaSyxContext context = new BaSyxContext("/","", hostString, Integer.parseInt(portString));
		context.addServletMapping("/*", servlet);
		server = new BaSyxHTTPServer(context);		

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
