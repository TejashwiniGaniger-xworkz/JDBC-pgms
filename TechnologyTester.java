package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TechnologyTester {

	public static void main(String[] args) {
		String username = "root";
		String password = "Tejashwini@123";
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String fqnOfDriverImpl = "com.mysql.cj.jdbc.Driver";
		Connection connection = null;
		try {
			Class.forName(fqnOfDriverImpl);
	        connection = DriverManager.getConnection(url, username,password);
			String query = "insert into tables.technology values('IOT',2,'Application','Kevin Aston','2015-01-20')";
			String query1 = "insert into tables.technology values('AI',3,'Bigadata','Herbert','1956-01-23')";
			String query2 = "insert into tables.technology values('Robot',4,'Aeronatics','Joseph','1954-05-23')";
			
	        Statement statement = connection.createStatement(); // impl-abstraction
	        statement.execute(query);
	        statement.execute(query2);
	        statement.execute(query1);
	        
			System.out.println(connection);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
