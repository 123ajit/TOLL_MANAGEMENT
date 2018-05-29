package org.jecm17.lifecycle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet extends GenericServlet {
	public FirstServlet() {
		System.out.println("Servlet object is created");
	}

	@Override
	public void init(ServletConfig config) {
		System.out.println("Servlet object is initilized");
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("nm");
		String place = req.getParameter("pl");

		PrintWriter out = resp.getWriter();
		out.println("<html>" + "<body bgcolr=yellow>" + "<h1>Welcome to " + place + " " + name + " ");
		out.flush();
		out.close();
	}

	@Override
	public void destroy() {
		System.out.println("close the costly resources");
	}
}
