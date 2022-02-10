package de.dfki.cos.basys.aas.registry.zookeeper;


import java.util.LinkedList;
import java.util.List;

//import javax.inject.Singleton;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.imps.CuratorFrameworkState;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.curator.utils.CloseableUtils;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.data.Stat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Charsets;

//import de.dfki.cos.basys.common.component.ServiceConnection;

//@Singleton
public class ZookeeperClient/* implements ServiceConnection */{

	public final Logger LOGGER;	
	
	protected CuratorFramework curator;	
	
	public ZookeeperClient() {
		LOGGER = LoggerFactory.getLogger(getClass().getName());
	}

	public ZookeeperClient(String connectionString) {
		LOGGER = LoggerFactory.getLogger(getClass().getName());
		connect(connectionString);
	}

	//@Override
	public boolean connect(/*ComponentContext context,*/ String connectionString) {
		if (isConnected()) 
			return isConnected();
		
		curator = CuratorFrameworkFactory.newClient(connectionString, new ExponentialBackoffRetry(1000, 3));
		
		try {
			curator.start();
			
		} catch (Exception e) {			
			LOGGER.error(e.getLocalizedMessage());
			disconnect();
		}		
		return isConnected();
	}

	//@Override
	public void disconnect() {
		CloseableUtils.closeQuietly(curator);
		curator = null;
	}

	//@Override
	public boolean isConnected() {		
		return curator != null && curator.getState() == CuratorFrameworkState.STARTED;
	}
	
	public CuratorFramework getClient() {
		return curator;
	}
	
	public void createPath(String path, String content) {
		try {
			curator.create()
				.creatingParentContainersIfNeeded()
				.withMode(CreateMode.PERSISTENT)
				.withACL(ZooDefs.Ids.OPEN_ACL_UNSAFE)				
				.forPath(path, content.getBytes(Charsets.UTF_8));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	public void deletePath(String path) {
		try {
			curator.delete()
				.deletingChildrenIfNeeded()
				.forPath(path);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean existsPath(String path) {
		Stat stat = null;
		try {
			stat = curator.checkExists().forPath(path);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return stat!=null;
	}
	
	public String getData(String path) {
		try {
			return new String(curator.getData().forPath(path), Charsets.UTF_8);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}
	
	public void setData(String path, String content) {		
		try {
			curator.setData().forPath(path, content.getBytes(Charsets.UTF_8));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}	
	
	public List<String> getChildren(String path) {
		 try {
			return curator.getChildren().forPath(path);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public List<String> getAllChildren(String path) {
		List<String> result = new LinkedList<String>();
		collectAllChildren("", path, result);
		return result;
	}
	
	private void collectAllChildren(String prefix, String path, List<String> accu)
	{		
		List<String> children = getChildren(path);
		for (String child : children) {
			accu.add(prefix + child);
			collectAllChildren(child + "/", path + "/" + child, accu);
		}
		
	}
	
	
}
