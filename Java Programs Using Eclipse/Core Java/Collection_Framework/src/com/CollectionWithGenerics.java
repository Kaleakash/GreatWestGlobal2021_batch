package com;

import java.util.ArrayList;
import java.util.List;

public class CollectionWithGenerics {

	public static void main(String[] args) {
		//Collection without Generics 
//		List ll = new ArrayList();
//		ll.add(10);		// auto-boxing 
//		ll.add("Raj");
//		ll.add(10.20);
//		
//		Object obj = ll.get(1);
//		Integer ii = (Integer)obj;
//		int n = ii.intValue();
//		System.out.println(n);

		// Collection framework with generics 
		//CollectionClass<Type> ll = new CollectionClass<Type>();
		// Type can be Integer, Float, String, Double, User-definedClass
		List<Integer> ll = new ArrayList<Integer>();
		ll.add(10);			// auto-boxing 
		ll.add(20);
		ll.add(30);
		
		int n = ll.get(0);			// auto-unboxing : converting object to primitive 
		System.out.println(n);
	}

}
