package com;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
	
		HashMap hm = new HashMap();
		hm.put(2, "Raj");
		hm.put(1, "Ravi");
		hm.put(3, "Ramesh");
		hm.put(5, "Raju");
		hm.put(4, "Lokesh");
		System.out.println(hm);
		hm.put(1,"Ajay");
		hm.put(6, "Raj");
		System.out.println(hm);
		System.out.println(hm.get(6));
		System.out.println(hm.containsKey(3));
		System.out.println(hm.containsValue("Ramesh"));
	}

}
