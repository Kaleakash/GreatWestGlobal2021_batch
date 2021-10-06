package com.resource;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	static Connection con;
	public static Connection getDbConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loaded Successfully");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "scott", "tiger");
		}catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}
}
