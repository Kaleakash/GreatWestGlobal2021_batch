package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
	List ll = new ArrayList();
	ll.add(10);
	ll.add(30);
	ll.add(20);
	ll.add(40);
	System.out.println(ll);
	Iterator ii = ll.iterator();
System.out.println("Using iterator");
	while(ii.hasNext()) {
		Object obj = ii.next();
		System.out.println(obj);
	}
	System.out.println(" ListIterator  - Forward direction");
	ListIterator li = ll.listIterator();
	while(li.hasNext()) {
		Object obj = li.next();
		System.out.println(obj);
	}
	System.out.println(" ListIterator  - Forward direction");
		while(li.hasPrevious()) {
			Object obj  = li.previous();
			System.out.println(obj);
		}
	}

}
