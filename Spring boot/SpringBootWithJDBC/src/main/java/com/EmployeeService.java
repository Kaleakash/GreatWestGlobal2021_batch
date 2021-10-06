package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service							// service layer annotation 
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	public String storeEmployeeDetails(Employee emp) {
		if(employeeDao.storeEmployee(emp)>0) {
			return "Record stored successfully";
		}else {
			return "Record didn't store";
		}
	}
}
