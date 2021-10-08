package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com")
@EntityScan(basePackages = "com.bean")		// this annotation name to scan all classes with @Entity annotation 
public class SpringBootProductCrudOperationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProductCrudOperationApplication.class, args);
		System.err.println("Server running on port number 9090");
	}

}
