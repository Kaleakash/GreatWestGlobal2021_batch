package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository						// DAO layer specific annotation 
public class EmployeeDao {
	@Autowired
	DataSource dataSource;		// pull the ds reference from container 
	
	public int storeEmployee(Employee emp) {
		try {
			Connection con = dataSource.getConnection();			// pull the connection reference from a container application.properties 
			PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?)");
			pstmt.setInt(1, emp.getId());
			pstmt.setString(2, emp.getName());
			pstmt.setFloat(3, emp.getSalary());
			return pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}
}
