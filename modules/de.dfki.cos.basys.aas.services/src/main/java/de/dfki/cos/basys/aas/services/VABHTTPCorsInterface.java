package de.dfki.cos.basys.aas.services;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.basyx.vab.modelprovider.api.IModelProvider;
import org.eclipse.basyx.vab.protocol.http.server.VABHTTPInterface;

public class VABHTTPCorsInterface<T extends IModelProvider> extends VABHTTPInterface<T> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public VABHTTPCorsInterface(T provider) {
		super(provider);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.addHeader("Allow-Control-Allow-Origin", "*");
		response.addHeader("Access-Control-Allow-Origin", "*");
		// res.addHeader("Access-Control-Allow-Origin", "http://podcastpedia.org"); //allows CORS requests only coming from podcastpedia.org
		response.addHeader("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT");
		response.addHeader("Access-Control-Allow-Headers", "X-Requested-With, Content-Type, X-Codingpedia");
		
		super.service(request, response);
	}
}
