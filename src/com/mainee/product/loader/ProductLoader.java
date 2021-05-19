package com.mainee.product.loader;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mainee.customer.loader.mysqldbConnection;

public class ProductLoader {

	static void PrintProduct() {
		try {
			
			
			Connection con=mysqldbConnection.GetDBConnection();
			Statement stmt=con.createStatement();
			ResultSet	rs=stmt.executeQuery("select * from sakila.inventory ;");

			while(rs.next()) {

			System.out.println(rs.getString(1)+"  "+rs.getString(2));
			}
			con.close();

		}
		catch(Exception	e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
	public static void main(String[] args) {
		PrintProduct();
		

	}


}
