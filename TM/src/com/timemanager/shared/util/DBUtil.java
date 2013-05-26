package com.timemanager.shared.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil { 
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(PropertiesReader.getProperty("url")
					,PropertiesReader.getProperty("user")
					,PropertiesReader.getProperty("password"));
			return conn;
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace(); 
		}
		return null; 
	}
}
