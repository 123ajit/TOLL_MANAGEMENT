package com.raj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Firstservlet extends GenericServlet
{
	public Firstservlet()
	{
		System.out.println("Servlet object is created");
	}
 public void init(ServletConfig config)
 {
	 System.out.println("Servlet object is initilized");
 }
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException 
	{
	String name=req.getParameter("nm");
	String place=req.getParameter("pl");
	
	PrintWriter out=resp.getWriter();
	out.println("<html>"
			+ "<body bgcolor=yellow>"
			+ "<h1>Welcome to "+place+" "+name+" ");
	out.flush();
	out.close();
	}
public void destroy()
{
	System.out.println("costly resources are closed");
}
}

