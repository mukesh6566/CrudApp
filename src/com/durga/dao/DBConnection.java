package com.durga.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection getConnection()
	{
		//Step1
		try {
			Class.forName("com.mysql.jdbc.Driver");
			///step2:
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/elevenclassdb", "root", "");
			if(con!=null)
			{
				return con;
			}
			else 
			{
				return null;
			}
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	
	}

}
