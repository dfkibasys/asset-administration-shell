package de.dfki.cos.basys.aas.server.service;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;

@Component
public class AasFileStorage {

	private Map<String, String[]> filePathToIdMap = new HashMap<>(); 
	
	public synchronized String[] replace(String relativePath, String[] ids) {
		String[] oldIds = filePathToIdMap.put(relativePath, ids);
		if (oldIds == null) {
			return new String[0];
		}
		return oldIds;
	}
	
	public synchronized String[] remove(String relativePath) {
		return filePathToIdMap.getOrDefault(relativePath, new String[0]);
	}	
	
	public synchronized String[] listIds() {
		return filePathToIdMap.values().stream().flatMap(Stream::of).collect(Collectors.toSet()).toArray(new String[0]);
	}
}
