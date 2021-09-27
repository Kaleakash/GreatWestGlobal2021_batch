package com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIteratorDemo {

	public static void main(String[] args) {
		Set ss = new HashSet();
		ss.add(10);
		ss.add(20);
		ss.add(30);
		ss.add(40);
		System.out.println(ss);
		System.out.println("using for each loop");
		for(Object n :ss) {
			System.out.println(n);
		}
		System.out.println("Using Iterator");
		Iterator ii	 =ss.iterator();
		while(ii.hasNext()) {
			Object obj = ii.next();
			System.out.println(obj);
		}
	}

}
