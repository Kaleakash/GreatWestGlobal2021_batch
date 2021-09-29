package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbTest {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loaded Successfully");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "scott", "tiger");
			System.out.println("Database connected successfully");
			Statement stmt = con.createStatement();
			// Retreive Query 
//			ResultSet	rs	= stmt.executeQuery("select * from employees");
//			while(rs.next()) {
//					System.out.println("id is "+rs.getInt(1)+" Name is "+rs.getString(2)+"Salary "+rs.getFloat("salary"));
//			}
//			rs.close();
			// insert Query 
//			int res = stmt.executeUpdate("insert into employee values(1,'Ajay',32000,'Developer')");
//			if(res>0) {
//				System.out.println("Record stored");
//			}else {
//				System.out.println("Record didn't store");
//			}
			// Delete Query 
//			int res = stmt.executeUpdate("delete from employee where id =1");
//			if(res>0) {
//				System.out.println("Record deleted");
//			}else {
//				System.out.println("Record not present");
//			}
			// Update 
			int res = stmt.executeUpdate("update employee set salary = 55000 where id = 5");
			if(res>0) {
				System.out.println("Record updated");
			}else {
				System.out.println("Record not present");
			}
			
			stmt.close();
			con.close();
		} catch (Exception e) {
		System.out.println(e);
		}
	}

}
