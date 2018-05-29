package org.jecm17.jdbcApp;

import java.sql.*;

public class Statement
{
public static void main(String[] args) 
{
    Connection con=null;
	java.sql.Statement statement=null;
	String qry="insert into jecm17.information values(2,'Rahul',89.55)";
	try {
		Class.forName("com.mysql.jdbc.Driver");
		{
		System.out.println("Load and register the driver");
		}
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=rahul");	
	{
		System.out.println("Establish the connection with the data base server");
	}
	 statement=con.createStatement();
	 {
		System.out.println("create a statement or platform"); 
	 }
	 statement.executeUpdate(qry);
	 {
	 System.out.println("Data inserted into DB sucessfully");
	 }
		
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
	finally
	{
		if(statement!=null)
		{
			try{
				statement.close();
			}
			catch(SQLException e){
				e.printStackTrace();
			}
		}
		

	}
}
}
