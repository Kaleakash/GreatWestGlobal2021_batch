package com;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		System.out.println(ll);
		ll.add(1, 100);
		System.out.println(ll);
		ll.addFirst(1);
		ll.addLast(2);
		System.out.println(ll);
		System.out.println("First "+ll.getFirst());
		System.out.println("last "+ll.getLast());
	}

}
