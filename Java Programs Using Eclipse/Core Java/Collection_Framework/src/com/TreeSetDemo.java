package com;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(40);
		ts.add(10);
		ts.add(30);
		ts.add(60);
		ts.add(20);
		//ts.add(10.20);
		System.out.println(ts);
		System.out.println(ts.headSet(30));
		System.out.println(ts.tailSet(40));
	}

}
