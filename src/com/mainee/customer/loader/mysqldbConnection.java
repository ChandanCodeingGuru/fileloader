package com.mainee.customer.loader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class mysqldbConnection {
	public static Connection GetDBConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/sakila","root","9431720849"); //Establishing Connection
			return con;
		} 
		catch (ClassNotFoundException | SQLException e) {
			System.out.println("Could not connect to database"+e.getMessage());
			return null;
		}

		
		
	}
}
