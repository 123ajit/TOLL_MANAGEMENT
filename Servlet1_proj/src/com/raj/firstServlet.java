package com.raj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class firstServlet extends GenericServlet
{
public firstServlet()
{
System.out.println("servlet object is created");
}
public void init(ServletConfig config)
{
System.out.println("servlet config object is initilized");
}
@Override
public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException
{
String name=req.getParameter("nm");
String place=req.getParameter("pl");
PrintWriter out=resp.getWriter();
out.println("<html> <body bgcolor=yellow>"
		+ "<h1> welcome "+name+" "+place+"</h1> "
		+ "</body></html>");
System.out.println("Service is executed");
out.flush();
out.close();
}
public void destroy()
{
	System.out.println("close all the costly resources");

}
}
