package com.suraj.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtility {

	private static String url = "jdbc:postgresql://localhost:5432/jdbcdemo";
	private static String username = "postgres";
	private static String password = "";
	private static Connection conn = null;
	
	public static Connection getConnection() {
		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection(url,username,password);
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
}
