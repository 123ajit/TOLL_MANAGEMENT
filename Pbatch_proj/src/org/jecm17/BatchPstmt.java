package org.jecm17;

import java.sql.*;

public class BatchPstmt {
public static void main(String[] args) {
	Connection con = null;
	PreparedStatement pstmt = null;
	PreparedStatement pstmt1 = null;
	String inqry = "insert into jecm17.student values(7,'shashi',76.44)";
	String delqry = "delete from jecm15.student where id = 4";
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=rahul");
		pstmt = con.prepareStatement(inqry);
		pstmt.addBatch();
		int arr[] = pstmt.executeBatch();
		for(int i : arr)
		{
			System.out.println(i);
		}
		pstmt1 = con.prepareStatement(delqry);
		pstmt1.addBatch();
		int arr1[] = pstmt1.executeBatch();
		for(int j : arr1)
		{
			System.out.println(j);
		}
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
	finally
	{
		if(pstmt1!=null)
		{
			try {
				pstmt1.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
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
