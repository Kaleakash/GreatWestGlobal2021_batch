package com;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);
		System.out.println("Get value using index position "+al.get(1));
		al.add(1, 100);
		System.out.println("Get value using index position "+al.get(1));
		System.out.println("Get value using index position "+al.get(2));
		al.set(2, 200);
		System.out.println("Get value using index position "+al.get(2));
		al.remove(3);			// using index position 
		Integer obj = 50;		// auto-boxing 
		al.remove(obj);		// using value 
		System.out.println(al);
	}

}
