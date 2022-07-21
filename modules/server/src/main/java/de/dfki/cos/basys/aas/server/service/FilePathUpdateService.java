package de.dfki.cos.basys.aas.server.service;

import java.util.Set;

import org.eclipse.basyx.submodel.metamodel.api.ISubmodel;
import org.eclipse.basyx.support.bundle.AASBundle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.dfki.cos.basys.aas.server.configuration.BaSyxContextConfiguration;
import de.dfki.cos.basys.aas.server.util.SubmodelFileEndpointLoader;

@Service
public class FilePathUpdateService {

	@Autowired
	private BaSyxContextConfiguration context;

	/**
	 * Fixes the File submodel element value paths according to the given endpoint
	 * configuration
	 */
	public void modifyFilePaths(AASBundle bundle) {
		Set<ISubmodel> submodels = bundle.getSubmodels();
		String hostName = context.getHostname();
		int port = context.getPort();
		String rootPath = context.getContextPath();
		for (ISubmodel sm : submodels) {
			SubmodelFileEndpointLoader.setRelativeFileEndpoints(sm, hostName, port, rootPath);
		}
	}

}
