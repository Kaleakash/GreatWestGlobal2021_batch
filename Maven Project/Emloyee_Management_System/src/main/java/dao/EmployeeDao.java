package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Employee;
import resource.DbConnection;

public class EmployeeDao {
	Connection con;
	public EmployeeDao() {
		con = DbConnection.getDbConnection();
	}
	public int insertEmployee(Employee emp) {
		try {
		
		PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?)");
		pstmt.setInt(1, emp.getId());
		pstmt.setString(2, emp.getName());
		pstmt.setFloat(3, emp.getSalary());
		int result = pstmt.executeUpdate();
		return result;
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	
	public List<Employee> getAllEmployeeDetails() {
		List<Employee> listOfEmp = new ArrayList<>();
		try {
			
			PreparedStatement pstmt = con.prepareStatement("select * from employee");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
						Employee emp = new Employee();
						emp.setId(rs.getInt(1));
						emp.setName(rs.getString(2));
						emp.setSalary(rs.getFloat(3));	// converting record into Employee object.
						listOfEmp.add(emp);
			}
			} catch (Exception e) {
				System.out.println(e);
			}
			return listOfEmp;
	}
}
