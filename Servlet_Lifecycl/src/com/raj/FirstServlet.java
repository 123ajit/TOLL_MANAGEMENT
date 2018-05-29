package com.raj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet extends GenericServlet
{
public FirstServlet()
{
System.out.println("Servlet object is created");
}
public void init(ServletConfig con)
{
System.out.println("Servlet Object is created");
}
public void Service(ServletRequest req,ServletResponse resp) throws IOException
{
String name=req.getParameter("nm");
String place=req.getParameter("pl");
PrintWriter out=resp.getWriter();

}
public void destroy()
{
System.out.println("Object is destroyed");
}
@Override
public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
	
}
	
}
