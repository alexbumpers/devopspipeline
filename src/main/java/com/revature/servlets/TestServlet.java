package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
public class TestServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(ServletRequest request, ServletResponse response) 
			throws ServletException, IOException {
		System.out.println("Service method was called.");
		// send a response message to the client
		PrintWriter pw = response.getWriter();
		pw.println("Hello world!");
	}
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Init method was called.");
	}
	
	public void destroy() {
		System.out.println("Destroy method was called.");
	}
}
