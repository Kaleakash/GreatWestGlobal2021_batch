package main;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import bean.Employee;
import service.EmployeeService;

public class App {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		EmployeeService es = new EmployeeService();
		String con="";
		do {
				System.out.println("1: Add Employee 2 : Display Employee");
				System.out.println("Enter your choice");
				int ch = obj.nextInt();
				switch(ch) {
				case 1:System.out.println("Enter the id");
				int id = obj.nextInt();
				System.out.println("Enter the name");
				String name = obj.next();
				System.out.println("Enter the salary");
				float salary = obj.nextFloat();
						Employee emp = new Employee(id,name,salary);
							boolean res = es.addEmployee(emp);
							if(res) {
								System.out.println("Record stored");
							}else {
								System.out.println("Record didn't store");
							}
							break;
				case 2:		List<Employee> listOfemp = es.getAllEmployeeDetails();
								Iterator<Employee> li   = listOfemp.iterator();
								while(li.hasNext()) {
									Employee e = li.next();
									System.out.println(e);
								}
							break;
				default : System.out.println("Wrong choice");
							break;
				}
				System.out.println("Do you want to continue(y/n)");
				con = obj.next();
		}while(con.equalsIgnoreCase("y"));
	}

}
