package com;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoTest {
	@Bean
	public CommandLineRunner commandLine(ApplicationContext ac) {
		return obj->{
			Employee emp = (Employee)ac.getBean("employee");
			emp.setId(111);
			emp.setName("Lokesh");
			emp.setSalary(22000);
			EmployeeService employeService = (EmployeeService)ac.getBean("employeeService");
			String res = employeService.storeEmployeeDetails(emp);
			System.out.println(res);
		};
	}
	public static void main(String args[]) {
		SpringApplication.run(DemoTest.class, args);		
	}

}
