package com.raj.Context;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/RJ")
public class Rahul extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException 
	{
		ServletContext ctx=getServletContext();
		String offmsg=ctx.getInitParameter("ofm");
		String offperc=ctx.getInitParameter("ofp");
		
		PrintWriter out=resp.getWriter();
		out.println("<html>"
				+ "<body bgcolor=lightgreen>"
				+ "<h5>"
				+ "village:<input type=text name=nm value=Mustafapur>"+"<br/>"
				+ "state  :<input type=text name=tx value=Bihar>"+"<br/>"
				+"PIN     :<input type=int name=PI value=804451>"
				+ "<a href=Home.html><br/>Back"
						+ "</h5></body></html>");
	}
}
