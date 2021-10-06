package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoTest {
	public static void main(String[] args) {
		SpringApplication.run(DemoTest.class, args);
		System.out.println("Spring boot aplication running");
		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext();
		acac.scan("com");		// to scan the package which contains all classes with annotation @Component 
		acac.refresh();
		//Employee emp= new Employee();
		//Employee emp = (Employee)acac.getBean("employee");		// bean id is by default class name using camel naming 
		Employee emp = (Employee)acac.getBean("obj");
		System.out.println(emp);
		Address add = (Address)acac.getBean("address");
		System.out.println(add);
		emp.display();
		acac.close();
	}																						//employee 
																							// EmployeeDetails ie id must be employeeDetails 

}
