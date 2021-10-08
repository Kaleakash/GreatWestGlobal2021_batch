package com;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
// http://localhost:9090/say 	
	@RequestMapping(value = "say",method = RequestMethod.GET)
	public String sayHello() {
		return "Welcome to Spring REST Controller Example";
	}
	// http://localhost:9090/html
	@RequestMapping(value = "html",
			method = RequestMethod.GET,
			produces = MediaType.TEXT_HTML_VALUE)
	public String sayHtml() {
		return "<font color=red>Welcome to Spring REST Controller Example</font>";
	}
	// http://localhost:9090/text
	@RequestMapping(value = "text",
			method = RequestMethod.GET,
			produces = MediaType.TEXT_PLAIN_VALUE)
	public String sayPlainText() {
		return "<font color=red>Welcome to Spring REST Controller Examplefont>";
	}
	// http://localhost:9090/xml
	@RequestMapping(value = "xml",
			method = RequestMethod.GET,
			produces = MediaType.TEXT_XML_VALUE)
	public String sayXml() {
		return "<a>Welcome to Spring REST Controller Example</a>";
	}
	//  http://localhost:9090/singleQuery?name=Raj
	@RequestMapping(value = "singleQuery")
	public String singleQueryParam(@RequestParam("name") String name) {
		return "Welcome user "+name;
	}
	
//  http://localhost:9090/multipleQuery?id=100&name=Mahesh
	@RequestMapping(value = "multipleQuery")
	public String multipleQueryParam(
			@RequestParam("id") int id, 
			@RequestParam("name") String name) {
		return "Your id is "+id+" Name is "+name;
	}
	// http://localhost:9090/singlePath/Raj
	@RequestMapping(value = "singlePath/{name}")
	public String singlePathParam(@PathVariable("name") String fname) {
		return "Welcome user to path param "+fname;
	}
//	http://localhost:9090/multiplePath/Raj/123
	@RequestMapping(value = "multiplePath/{user}/{pass}")
	public String multiplePathValue(@PathVariable("user") String user, 
			@PathVariable("pass") String pass) {
		if(user.equals("Raj") && pass.equals("123")) {
			return "success";
		}else {
			return "failure";
		}
	}
	
	// http://localhost:9090/empInfo
	@RequestMapping(value = "empInfo",
	produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployeeInfo() {
		Employee emp = new Employee(100,"Raj",12000);
		return emp;
	}
	// http://localhost:9090/employeeDetails
	@RequestMapping(value = "employeeDetails",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllEmployeeInfo() {
		List<Employee> listOfEmp = new ArrayList<>();
		Employee emp1  = new Employee(1, "Raj", 12000);
		listOfEmp.add(emp1);
		listOfEmp.add(new Employee(2,"Raju",14000));
		listOfEmp.add(new Employee(3, "Lokesh", 16000));
		return listOfEmp;
	}
	
	// http://localhost:9090/storeEmployeeInfo
	@RequestMapping(value = "storeEmployeeInfo",
	consumes = MediaType.APPLICATION_JSON_VALUE,
	method = RequestMethod.POST)
	public String storeData(@RequestBody Employee emp) {
		System.out.println(emp);			// it call toString method 
		return "Welcome user "+emp.getName();
	}
	
	// http://localhost:9090/updateEmployeeInfo
	@RequestMapping(value = "updateEmployeeInfo",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE,
			method = RequestMethod.PUT)
	public Employee updateEmployeeInfo(@RequestBody Employee emp) {
			emp.setSalary(emp.getSalary()+2000);
			return  emp;
	}
	// http://localhost:9090/deleteEmpInfo
		@RequestMapping(value = "deleteEmpInfo/{id}",method = RequestMethod.DELETE)
	public String deleteEmployeeInfo(@PathVariable("id") int id) {
		return "REcord deleted with id as "+id;
	}
}


