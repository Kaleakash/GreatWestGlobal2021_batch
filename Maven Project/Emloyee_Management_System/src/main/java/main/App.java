package main;

import java.util.Iterator;
import java.util.List;

import bean.Employee;
import service.EmployeeService;

public class App {

	public static void main(String[] args) {
		EmployeeService es = new EmployeeService();
//		Employee emp1 = new Employee(102, "Ajay", 14000);
//		String result = es.storeEmployee(emp1);
//		System.out.println(result);
		List<Employee> listOfEmp = es.getAllEmployeeDetails();
		Iterator<Employee> li = listOfEmp.iterator();
		while(li.hasNext()) {
			Employee emp = li.next();
			System.out.println(emp);
		}
	}

}
