package com;

import java.util.HashSet;
class A {}
class B {}
public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		int a=10;
		Integer b =new Integer(a);			// converting primitive to object. using wrapper 
		hs.add(b);	
		hs.add(20);					// auto-boxing : converting primitive to object. 
		hs.add(10.20);
		hs.add("Raj");
		hs.add(true);
		A obj1 = new A();
		B obj2 = new B();
		hs.add(obj1);
		hs.add(obj2);
		System.out.println(hs);
	}

}
