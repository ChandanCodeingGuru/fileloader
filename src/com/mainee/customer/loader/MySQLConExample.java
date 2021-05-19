package com.mainee.customer.loader;

import java.io.FileWriter;
import java.sql.Connection;

import java.sql.ResultSet;

import java.sql.Statement;

public class MySQLConExample {
	
	static void PrintCustomer() {
		try {
			
			try (FileWriter myWriter = new FileWriter("e:\\data\\customeractor.csv")) {
				Connection con=mysqldbConnection.GetDBConnection(); // Get DB Connection
				Statement stmt=con.createStatement();  // Create statement object
				ResultSet	rs=stmt.executeQuery("select * from sakila.actor where first_name like 'Ç%';"); //Execute SQL Query using statement object
				//Looping through each records which we fetched from database	
				while(rs.next()) {

				System.out.println(rs.getString(1)+"  "+rs.getString(2));
				myWriter.write(rs.getString(1)+","+rs.getString(2)+"\n"); // Write into file first and second column
				}
				con.close();
			}

		}
		catch(Exception	e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
	public static void main(String[] args) {
		PrintCustomer();
		

	}

}
