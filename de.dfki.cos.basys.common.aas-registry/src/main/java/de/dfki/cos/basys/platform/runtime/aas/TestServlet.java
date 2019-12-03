package de.dfki.cos.basys.platform.runtime.webapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet(name = "TestServlet", urlPatterns = "/test")
public class TestServlet extends HttpServlet {

	private static final long serialVersionUID = -4751096228274971485L;
	
	public TestServlet() {
		// TODO Auto-generated constructor stub
	}

	 public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
	        PrintWriter writer = response.getWriter();
	        writer.println(request.getParameter("function"));
	        if ("getContextPath".equals(request.getParameter("function"))) {
	            writer.println(request.getContextPath());
	        } else if ("getLocalAddr".equals(request.getParameter("function"))) {
	            writer.println(request.getLocalAddr());
	        } else if ("getLocalName".equals(request.getParameter("function"))) {
	            writer.println(request.getLocalName());
	        } else if ("getLocalAPort".equals(request.getParameter("function"))) {
	            writer.println(request.getLocalPort());
	        } else if ("getMethod".equals(request.getParameter("function"))) {
	            writer.println(request.getMethod());
	        } else if ("getParameterNames".equals(request.getParameter("function"))) {
	            writer.println(request.getParameterNames());
	        } else if ("getPathInfo".equals(request.getParameter("function"))) {
	            writer.println(request.getPathInfo());
	        } else if ("getProtocol".equals(request.getParameter("function"))) {
	            writer.println(request.getProtocol());
	        } else if ("getQueryString".equals(request.getParameter("function"))) {
	            writer.println(request.getQueryString());
	        } else if ("getRequestedSessionId".equals(request.getParameter("function"))) {
	            writer.println(request.getRequestedSessionId());
	        } else if ("getRequestURI".equals(request.getParameter("function"))) {
	            writer.println(request.getRequestURI());
	        } else if ("getRequestURL".equals(request.getParameter("function"))) {
	            writer.println(request.getRequestURL());
	        } else if ("getScheme".equals(request.getParameter("function"))) {
	            writer.println(request.getScheme());
	        } else if ("getServerName".equals(request.getParameter("function"))) {
	            writer.println(request.getServerName());
	        } else if ("getServerPort".equals(request.getParameter("function"))) {
	            writer.println(request.getServerPort());
	        } else if ("getServletPath".equals(request.getParameter("function"))) {
	            writer.println(request.getServletPath());
	        } else if ("getResourcePaths".equals(request.getParameter("function"))) {
	        	writer.println("Path: " + request.getParameter("path"));
	        	Set<String> paths = getServletContext().getResourcePaths(request.getParameter("path"));
	    		for (String path : paths) {
	    			writer.println(path);
	    		}	        	
	        } else if ("loadClass".equals(request.getParameter("function"))) {
	        	writer.println("Class: " + request.getParameter("class"));
	        	try {
		        	writer.println("1st try");
		        	writer.println("Using ClassLoader: " + this.getClass().getClassLoader().toString());
					Class c = Class.forName(request.getParameter("class"));
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
					try {
			        	writer.println("2nd try");
			        	writer.println("Using ClassLoader: " + getServletContext().getClassLoader().toString());
						Class c = Class.forName(request.getParameter("class"),true, getServletContext().getClassLoader());
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}	        	      	
	        } else {
	            writer.println("INVALID FUNCTION");
	        }
	        writer.flush();
	    }

	@Override
	public void init() throws ServletException {
		System.out.println("Servlet " + this.getServletName() + " has started");
	}

	@Override
	public void destroy() {
		System.out.println("Servlet " + this.getServletName() + " has stopped");
	}
}
