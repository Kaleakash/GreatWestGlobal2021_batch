package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapIteratorDemo {

	public static void main(String[] args) {
		Map mm =new HashMap();
		mm.put(1, "Raj");
		mm.put(2,"Ramesh");
		mm.put(3, "Lokesh");
		System.out.println(mm);
//		for(Object obj : mm) {
//			System.out.println(obj);
//		}
		Set ss = mm.entrySet();	// converting map to set 
		Iterator ii =ss.iterator();		
		while(ii.hasNext()) {
			//Object obj = ii.next();
			//System.out.println(obj);
			Map.Entry me = (Map.Entry)ii.next();		// converting set to map
			System.out.println(me.getKey()+"     "+me.getValue());
		}
	}

}
