package com;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
//class MyConsumer implements Consumer<String>{
//	@Override
//	public void accept(String t) {
//		System.out.println("names are "+t);
//	}
//}
public class DemoTest1 {

	public static void main(String[] args) {
	List<String> names = new ArrayList<>();
	names.add("Raj");names.add("Raju");names.add("Ramesh");names.add("Dinesh");names.add("Kishor");
	names.add("Reeta");names.add("Meeta");names.add("Mahesh");names.add("Laximan");names.add("Arjun");
	names.add("Ajay");names.add("Vijay");names.add("Lokesh");names.add("Ram");names.add("Reeta");
	//Consumer<String> cc = new MyConsumer();
	//names.forEach(cc);
	names.forEach((v)->System.out.println(v));		// using lambd display the value. 
	}

}
