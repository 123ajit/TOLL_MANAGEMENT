package org.jecm17.jdbcApp;

import java.sql.*;

public class BatchStatement 
{
public static void main(String[] args) 
{
	Connection con = null;
	Statement stmt=null;
	
	String inqry="insert into jecm17.information value(9,'Manoj',89.54)";
	String upqry="update jecm17.information setname='manju' where id=3";
try {
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("Driver is loaded and registered");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=rahul");
	System.out.println("Connectin is established with the data base server");
	stmt=con.createStatement();
	System.out.println("Statement or platform is created");
	stmt.addBatch(inqry);
	stmt.addBatch(upqry);
	System.out.println("queries are added");
	int arr[]=stmt.executeBatch();
	for(int i:arr)
	{
		System.out.println(i);
	}
} catch (ClassNotFoundException | SQLException e) {
	e.printStackTrace();
}
finally
{
	if(stmt!=null)
	{
		try {
			stmt.close();
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
