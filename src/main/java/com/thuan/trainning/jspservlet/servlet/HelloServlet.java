package com.thuan.trainning.jspservlet.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletOutputStream out = resp.getOutputStream();

		out.println("<html>");
		out.println("<head><title>Init Param</title></head>");

		out.println("<body>");
		out.println("<h3>Servlet with Annotation configuration</h3>");
		out.println("<p>emailSupport1 = " + "test1@gmail.com" + "</p>");
		out.println("<p>emailSupport2 = " + "test2@gmail.com" + "</p>");
		out.println("</body>");
		out.println("<html>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
