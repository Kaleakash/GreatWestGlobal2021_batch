package com;

import java.util.HashSet;

public class HashSetDemo1 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		System.out.println("size "+hs.size());
		System.out.println("is empty "+hs.isEmpty());
		hs.add(30);
		hs.add(10);
		hs.add(20);
		hs.add(50);
		hs.add(60);
		hs.add(40);
		System.out.println(hs);
		System.out.println(" Search "+hs.contains(50));
		System.out.println("Search "+hs.contains(100));
		System.out.println("Remove "+hs.remove(30));
		System.out.println("Remove "+hs.remove(100));
		System.out.println(hs);
		System.out.println("size "+hs.size());
		System.out.println("is empty "+hs.isEmpty());
		hs.clear();
		System.out.println("size "+hs.size());
		System.out.println("is empty "+hs.isEmpty());
	}

}
