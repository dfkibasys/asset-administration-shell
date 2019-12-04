package de.dfki.cos.basys.common.aas;

import static org.junit.Assert.*;

import java.util.Collections;

import org.eclipse.basyx.submodel.metamodel.map.identifier.IdentifierType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.dfki.cos.basys.aas.registry.rest.api.dto.AasDescriptor;
import de.dfki.cos.basys.aas.registry.rest.api.dto.Endpoint;
import de.dfki.cos.basys.aas.registry.rest.api.dto.Identifier;
import de.dfki.cos.basys.aas.registry.rest.api.dto.SubmodelDescriptor;
import de.dfki.cos.basys.common.aas.registry.server.ZookeeperAasRegistry;
import de.dfki.cos.basys.common.aas.registry.server.ZookeeperClient;

public class ZookeeperAasRegistryTest {

	String connectionString = "lns-90165.sb.dfki.de:2181";
	ZookeeperClient client;
	ZookeeperAasRegistry registry;
	AasDescriptor aas;
	SubmodelDescriptor sm1, sm2;
	@Before
	public void setUp() throws Exception {
		client = new ZookeeperClient();
		client.connect(connectionString);
		registry= new ZookeeperAasRegistry(client);
		
		
		aas = new AasDescriptor();
		aas.setIdShort("myAas2aasd");
		aas.setIdentification(new Identifier(IdentifierType.Custom, "myAasasd"));
		aas.setEndpoints(Collections.singletonList(new Endpoint("http", "http://localhost")));

		sm1 = new SubmodelDescriptor();
		sm1.setIdShort("mySubmodel1");
		sm1.setIdentification(new Identifier(IdentifierType.Custom, "mySubmodel1asdasd"));
		sm1.setEndpoints(Collections.singletonList(new Endpoint("http", "http://localhost/sm1")));

		sm2 = new SubmodelDescriptor();
		sm2.setIdShort("mySubmodel2");
		sm2.setIdentification(new Identifier(IdentifierType.Custom, "mySubmodeasdasdl2"));
		sm2.setEndpoints(Collections.singletonList(new Endpoint("http", "http://localhost/sm2")));
		
		aas.getSubmodels().add(sm1);	
	}

	@After
	public void tearDown() throws Exception {
		client.disconnect();
	}

	@Test
	public void testRegisterAas() {
		assertTrue(client.isConnected());
		
		registry.registerAas(aas);
		
		registry.registerAasSubmodel(aas.getIdShort(), sm2);
		
		
	}

}
