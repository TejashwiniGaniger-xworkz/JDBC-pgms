package com.xworkz.scam.count;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ScamCount {

	public static void main(String[] args) {
		try (Connection connection = DriverManager.getConnection(JdbcConstant.URL, JdbcConstant.USERNAME,
				JdbcConstant.SECRET)) {
			String query = "SELECT * FROM scam";
			Statement statement = connection.createStatement();
			statement.execute(query);
			ResultSet resultSet = statement.getResultSet();
			int count = 0;
			while (resultSet.next()) {
				count++;
			}
			System.out.println(count);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}