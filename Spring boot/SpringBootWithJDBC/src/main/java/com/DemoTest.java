package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoTest {
	public static void main(String args[]) {
		SpringApplication.run(DemoTest.class, args);
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.scan("com");
		ac.refresh();
		Employee emp = (Employee)ac.getBean("employee");
		emp.setId(107);
		emp.setName("Lokesh");
		emp.setSalary(22000);
		EmployeeService employeService = (EmployeeService)ac.getBean("employeeService");
		String res = employeService.storeEmployeeDetails(emp);
		System.out.println(res);
	}

}
