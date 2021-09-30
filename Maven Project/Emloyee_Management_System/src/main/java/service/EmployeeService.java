package service;

import java.util.Iterator;
import java.util.List;

import bean.Employee;
import dao.EmployeeDao;

public class EmployeeService {
EmployeeDao employeeDao = new EmployeeDao();

public String storeEmployee(Employee emp) {
	if(emp.getSalary()<10000) {			// terms and condition simple or complex 
		return "Salary must be > 10000";
	}else {
		if(employeeDao.insertEmployee(emp)>0) {
				return "Record insert successfully";
		}else {
			return "Record didn't insert";
		}
	}
}

public List<Employee> getAllEmployeeDetails() {
	List<Employee> listOfEmp = employeeDao.getAllEmployeeDetails();
	Iterator<Employee> li  = listOfEmp.iterator();
	while(li.hasNext()) {
		Employee emp = li.next();
		emp.setSalary(emp.getSalary()+emp.getSalary()*0.10f);
	}
	return listOfEmp;
}

}
