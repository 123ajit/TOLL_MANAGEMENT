package com.raj;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet4 extends HttpServlet
{
protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException
{
	String sid=req.getParameter("i");
	int id=Integer.parseInt(sid);
	String name=req.getParameter("nm");
	String dept=req.getParameter("dp");
	String perc=req.getParameter("pr");
	double per=Double.parseDouble(perc);
	PrintWriter out=resp.getWriter();
	out.println("<html><body bgcolor=yellow>"
			+ "<h1>welcome"+name+"to"+dept+"with percentage"+perc+"</h1>"
			+ "</body></html>");
	out.flush();
	out.close();
	Connection con=null;
	PreparedStatement pstmt=null;
	String qry="insert into jecm17.rahul values(?,?,?,?)";
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=rahul");
		pstmt=con.prepareStatement(qry);
		pstmt.setInt(1,id);
		pstmt.setString(2,name);
		pstmt.setString(3,dept);
		pstmt.setDouble(4,per);
		pstmt.executeUpdate();
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
	finally
	{
		if(pstmt!=null)
		{
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(con!=null)
		{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	}
}
