package com.xworkz.flowerex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SunFlower {

	public static void main(String[] args) {
		String username = "root";
		 String password = "Tejashwini@123";
		 String url = "jdbc:mysql://localhost:3306/jdbc";
		 String fqnOfDriverImpl = "com.mysql.cj.jdbc.Driver";
		 Connection connection = null;
		 try {
			 Class.forName(fqnOfDriverImpl);
			 connection = DriverManager.getConnection(url,username,password);
			 String query1 = "insert into rose values(6,'Yellow',50,'SunFlower','false','false',15,'M','M')";
			
			Statement statement = connection.createStatement();
			statement.execute(query1);
			System.out.println(connection);
			 System.out.println(statement);
		 }catch(SQLException e) {
			 e.printStackTrace();
		 }catch(ClassNotFoundException e) {
			 e.printStackTrace();
		 }finally {
			 try {
				 connection.close();
			 }catch(SQLException e) {
				 e.printStackTrace();
			 }
		 }

	}

}


	
