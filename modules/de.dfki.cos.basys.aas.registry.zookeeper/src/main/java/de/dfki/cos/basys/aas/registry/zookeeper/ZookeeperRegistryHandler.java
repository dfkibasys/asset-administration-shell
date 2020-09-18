package de.dfki.cos.basys.aas.registry.zookeeper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.basyx.aas.metamodel.api.parts.asset.IAsset;
import org.eclipse.basyx.aas.metamodel.map.descriptor.AASDescriptor;
import org.eclipse.basyx.aas.registration.memory.IRegistryHandler;
import org.eclipse.basyx.submodel.metamodel.api.identifier.IIdentifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.netty.handler.codec.string.LineSeparator;

public class ZookeeperRegistryHandler implements IRegistryHandler {
	public final Logger LOGGER;
	public static final String PREFIX = "/basys/aas-registry";

	private ObjectMapper mapper = new ObjectMapper();
	
	private ZookeeperClient client = null;
	
	public ZookeeperRegistryHandler() {
		LOGGER = LoggerFactory.getLogger(getClass().getName());
		client = new ZookeeperClient();
	}
		
	public ZookeeperRegistryHandler(String connectionString) {
		LOGGER = LoggerFactory.getLogger(getClass().getName());
		client = new ZookeeperClient(connectionString);
	}		
		
	public boolean connect(String connectionString) {
		return client.connect(connectionString);
	}
	
	public void disconnect() {		
		client.disconnect();
	}

	public boolean isConnected() {		
		return client.isConnected();
	}
	
	public void clean() {
		if (client.existsPath(PREFIX))
			client.deletePath(PREFIX);
	}
	
	/*
	 * IRegistryHandler implementation
	 */
	
	@Override
	public boolean contains(IIdentifier id) {
		String path = getPath(id);
		return client.existsPath(path);
	}
			
	@Override
	public void remove(IIdentifier id) {		
		AASDescriptor removed = get(id);

		String path = getPath(id);
		client.deletePath(path);
		
		IIdentifier aasId = removed.getIdentifier();
		if (!aasId.getId().equals(id.getId())) {
			// id is an assetId => also remove the aasId-mapping
			path = getPath(aasId);
			client.deletePath(path);
		} else {
			IAsset asset = removed.getAsset();
			if (asset != null) {
				IIdentifier assetId = asset.getIdentification();
				path = getPath(assetId);
				client.deletePath(path);
			}
		}
	}

	@Override
	public void insert(AASDescriptor descriptor) {
		String path = getPath(descriptor.getIdentifier());
		try {
			String content = mapper.writeValueAsString(descriptor);
			client.createPath(path, content);
			
			// insert with asset id if present
			// see also MapRegistryHandler.java
			IAsset asset = descriptor.getAsset();
			if (asset != null) {				
				path = getPath(asset.getIdentification());
				client.createPath(path, content);				
			}			
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(AASDescriptor descriptor) {
		String path = getPath(descriptor.getIdentifier());		
		try {
			String content = mapper.writeValueAsString(descriptor);
			client.setData(path, content);
			
			// insert with asset id if present
			// see also MapRegistryHandler.java
			IAsset asset = descriptor.getAsset();
			if (asset != null) {				
				path = getPath(asset.getIdentification());
				client.setData(path, content);				
			}		
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

	@Override
	public AASDescriptor get(IIdentifier id) {
		String path = getPath(id);
		
		if (!client.existsPath(path))
			return null;
		
		String content = client.getData(path);
		try {
			AASDescriptor aasDescriptor = mapper.readValue(content, AASDescriptor.class);
			return aasDescriptor;
		} catch (IOException e) {		
			e.printStackTrace();
			return null;
		}		
	}

	@Override
	public List<AASDescriptor> getAll() {

		HashMap<String, AASDescriptor> aasDescriptors = new HashMap<>();
		
		String path = getPath();		
		if (client.existsPath(path)) {
			List<String> aasIds = client.getAllChildren(path);
			for (String aasId : aasIds) {
				String content = client.getData(getPath(aasId));			
				if (content != null && !"".equals(content)) {
					try {
						AASDescriptor aasDescriptor = mapper.readValue(content, AASDescriptor.class);
						aasDescriptors.put(aasDescriptor.getIdentifier().getId(), aasDescriptor);	
					} catch (IOException e) {
						e.printStackTrace();
					}					
				}
			}		
		}
		
		return new ArrayList<>(aasDescriptors.values());
	}
	

	private String getPath() {
		return PREFIX;
	}
	
	private String getPath(IIdentifier id) {
		return PREFIX + "/" + id.getId();
	}	
	
	private String getPath(String aasId) {
		return PREFIX + "/" + aasId;
	}

}
