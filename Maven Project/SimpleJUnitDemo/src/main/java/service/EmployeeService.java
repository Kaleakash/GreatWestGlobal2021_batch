package service;

import java.util.ArrayList;
import java.util.List;

import bean.Employee;

public class EmployeeService {

	public Employee getEmployee() {
		Employee emp = new Employee(100, "Raj", 12000);
		return emp;
	}
	
	public 	String passListInfo(List<Employee> listOfEmp) {
				// coding 
		return "done";
	}
	
	public List<Employee> getAllEmployeeDetails() {
		List<Employee> listOfEmp = new ArrayList<>();
		listOfEmp.add(new Employee(100, "Raj", 12000));
		listOfEmp.add(new Employee(101, "Ravi", 10000));
		listOfEmp.add(new Employee(102, "Rameh", 13000));
		listOfEmp.add(new Employee(103, "Raju", 16000));
		return listOfEmp;
	}
	
	public boolean checkUser(String name, String pass) {
		if(name.equals("Raj") && pass.equals("123")) {
				return true;
		}else {
			return false;
		}
	}
	
}
