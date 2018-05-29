package com.raj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ep")
public class SecondServlet extends GenericServlet
{
public SecondServlet()
{
	System.out.println("Servlet Object is Created");
}
public void init(ServletConfig config)
{
	System.out.println("Servlet config Object is Initilized");
}
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
    
	ServletContext ctx=getServletContext();
	String offermsg=ctx.getInitParameter("ofm");
	String offerfor=ctx.getInitParameter("ofp");
	
	PrintWriter out=resp.getWriter();
	out.println("<html><body bgcolor=pink>"
			+ "<h1>Electronic products</h1>"
			+ "The offer on electronic product is:"+offermsg+"<br>"
			+ "Discount on electronic product is:"+offerfor+"<br>"
			+ "<a href=Product.html>Back</a>"
			+ "</html>");
	out.flush();
	out.close();
	}
}
