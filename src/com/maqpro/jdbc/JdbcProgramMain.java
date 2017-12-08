package com.maqpro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class JdbcProgramMain {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/golfgalaxy";
			Connection connection = DriverManager.getConnection(url, "root", "123456");
			String query = "select * from customer;";
			Statement statement = connection.createStatement();
			// System.out.println("output of queryr: " + statement.executeQuery(query));
			ResultSet resultSet = statement.executeQuery(query);
			while (resultSet.next()) {
				// int custId = resultSet.getInt(1);
				int custId = resultSet.getInt("customer_id");
				String custName = resultSet.getString("customer_name");
				Date custDOB = resultSet.getDate("customer_dob");
				String custPhone = resultSet.getString("customer_phone");
				System.out.println("Customer Id:" + custId + ", customer name: " + custName + ", customer dob: "
						+ custDOB + ", customer phone: " + custPhone);
			}
			// custPhone = "773-000-0000";
			System.out.println("Running update query");
			query = "update customer set customer_phone=\"773-000-4444\";";
			int rowsEffected = statement.executeUpdate(query);
			System.out.println("Rows effected: " + rowsEffected);
		} catch (ClassNotFoundException e) {
			System.out.println("Exception occured: " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("SQL exception occured: " + e.getMessage());
		}
	}

}
