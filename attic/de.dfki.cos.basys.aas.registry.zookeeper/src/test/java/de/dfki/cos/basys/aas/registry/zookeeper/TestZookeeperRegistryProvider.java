package de.dfki.cos.basys.aas.registry.zookeeper;

import org.eclipse.basyx.aas.registration.api.IAASRegistry;
import org.eclipse.basyx.aas.registration.memory.AASRegistry;
import org.eclipse.basyx.testsuite.regression.aas.registration.TestRegistryProviderSuite;

/**
 * Test class for a local registry provider based on SQL tables
 * 
 * @author espen
 *
 */
public class TestZookeeperRegistryProvider extends TestRegistryProviderSuite {
	
	@Override
	protected IAASRegistry getRegistryService() {
		String zkString = "lns-90165.sb.dfki.de:2181";
		//String zkString = "localhost:2181";
		String prefix = "/basys/aas-registry-test";
		ZookeeperRegistryHandler handler = new ZookeeperRegistryHandler(zkString, prefix);
		return new AASRegistry(handler);
	}
}