package br.com.impacta.javaweb.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet2 extends HelloServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HelloServlet2(){
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		response.getWriter().append("<h2>WS - Servlet Mapeamento por annotation web.xml</h2>");
	}
}
