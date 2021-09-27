package com;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		//HashSet lhs = new HashSet();
		lhs.add(30);
		lhs.add(50);
		lhs.add(20);
		lhs.add(10);
		lhs.add(60);
		System.out.println(lhs);

	}

}
