package service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import bean.Employee;

public class EmployeeService {
	List<Employee> listOfEmp = new ArrayList<>();
	public boolean addEmployee(Employee emp) {
			int flag = 0;
			if(listOfEmp.size()==0) {
				return listOfEmp.add(emp);
			}else {
				Iterator<Employee> li  = listOfEmp.iterator();
				while(li.hasNext()) {
					Employee e = li.next();
					if(e.getId()==emp.getId()) {
						flag++;
						break;
					}
				}
				if(flag==0) {
					return listOfEmp.add(emp);
				}else {
					return false;
				}
			}
	}
	
	public List<Employee> getAllEmployeeDetails() {
		return listOfEmp;
	}
}
