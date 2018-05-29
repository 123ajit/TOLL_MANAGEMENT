package org.jecm17.lifecycleApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class firstservlet extends GenericServlet
{
public firstservlet()
{
System.out.println("servlet object is created");	
}
@Override
public void init(ServletConfig config) throws ServletException
{
	System.out.println("Servlet object is initiated");
}
@Override
public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException 
{
	String name=req.getParameter("nm");
	String place=req.getParameter("pl");
	
	PrintWriter out=resp.getWriter();
	out.println("<html>"
			+ "<body bgcolor=yellow>"
			+ "<h1>"+name+" you are most Welcome to  "+place+"</h1>"
			+ "</body></html>");
	//out.flush();
	//out.close();
	System.out.println("service() is executed");
}
//@Override
//public void destroy()
{
	//System.out.println("close costly resources");
}
}
