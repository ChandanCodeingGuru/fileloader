package com.mainee.customer.loader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;

public class CustomerLoader {
	 public static void main(String[] args) {

	     
		 Logger mylogger= Logger.getLogger(CustomerLoader.class.getName()); // log4j 
		 PropertyConfigurator.configure("log4j.properties");
	        try (
	        		
	        		FileWriter myWriter = new FileWriter("e:\\data\\customer19thmay.csv");
	        		BufferedReader br = Files.newBufferedReader(Paths.get("e:\\data\\customer_20210518.csv")) ) {
	        		mylogger.log(Level.INFO,"Äpplication is reading the file");
	            // read line by line
	            String line;
	            while ((line = br.readLine()) != null) {
	            	
	            	String CustomerID=line.split(",")[0];
	            	String CustomerName=line.split(",")[1];
	            	String City=line.split(",")[2];
	            	if(line.split(",")[3].equals("Discount")) {
	            		System.out.println(line.split(",")[2]);
	            	}
	            	else {
	            		float discount= Float.parseFloat(line.split(",")[3]); //discount from file is coming in string. typecasting it from String to float

	            		//check if discount is greater than 10, write in a file customer10more.csv
	            		if (discount >=10) {		            		
		            	      myWriter.write(line+"\n");
		            	      //myWriter.close();
	            		}
	            	}
	            	
	            	
	            }

	        } catch (IOException e) {
	        	mylogger.severe("File Reading failed "+e.getMessage());
	        }

	      //  System.out.println(sb);

	    }


}
