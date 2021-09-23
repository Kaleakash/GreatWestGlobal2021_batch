package com;

import bean.Account;

public class DemoTest {

	public static void main(String[] args) {
//		Employee employees[]=new Employee[100];
//		//Employee emp = new Employee();
//		int flag =100;
//		for(int i=0;i<5;i++) {
//			employees[i]=new Employee();
//			employees[i].id=flag;			// set the value for property 
//			flag++;
//		}
//		for(int i=0;i<5;i++) {
//			employees[i].dis();			// call the methods 
//		}
		Account acc1 = new Account();
		acc1.setAccno(100);
		acc1.setName("Raj");
		acc1.setAmount(1200);
		
		Account acc2 = new Account(101,"RAvi",14000);
		
		System.out.println(" accno "+acc1.getAccno());
		System.out.println(" Name "+acc1.getName());
		System.out.println(" Amount "+acc1.getAmount());
		
		System.out.println(" accno "+acc2.getAccno());
		System.out.println(" Name "+acc2.getName());
		System.out.println(" Amount "+acc2.getAmount());
		
		System.out.println(acc1);	
	}

}
