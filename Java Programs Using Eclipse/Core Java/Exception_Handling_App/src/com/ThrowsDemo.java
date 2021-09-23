package com;

public class ThrowsDemo {

	static void dis1() throws Exception{
		//try {
		int a=10/0;
		//}catch(Exception e) {}
		System.out.println("dis1 method");
	}
	public static void main(String[] args) throws Exception{
		//try {
		dis1();
		//}catch(Exception e) {}
		System.out.println("Main method");
	}

}
