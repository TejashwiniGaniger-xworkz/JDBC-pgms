package com.xworkz.scamexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ScamUpdateYearAmountLocationTypebyNameId {

	public static void main(String[] args) {
		String username = "root";
		String password = "Tejashwini@123";
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String fqnOfDriverImpl = "com.mysql.cj.jdbc.Driver";
		Connection connection = null;
		try {
			Class.forName(fqnOfDriverImpl);
	        connection = DriverManager.getConnection(url, username,password);
			String query = "update scam set s_year = '2018-06-22', s_amount =140 , s_location = 'Bangalore' where (s_name ='TRP scam' and s_id = 5)";
	        Statement statement = connection.createStatement(); // impl-abstraction
	        statement.execute(query);
			System.out.println(connection);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}