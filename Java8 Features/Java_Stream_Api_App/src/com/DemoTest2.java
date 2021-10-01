package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoTest2 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Raj");names.add("Raju");names.add("Ramesh");names.add("Dinesh");names.add("Kishor");
		names.add("Reeta");names.add("Meeta");names.add("Mahesh");names.add("Laximan");names.add("Arjun");
		names.add("Ajay");names.add("Vijay");names.add("Lokesh");names.add("Ram");names.add("Reeta");
		
//		Stream<String> ss = names.stream();
//		ss.forEach(v->System.out.println(v));
		
//		Stream<String> ss = names.stream();	// stream created 
//		Stream<String> ss1 = ss.map(v->v.toUpperCase());// apply intermediate operator 
//		ss1.forEach(v->System.out.println(v));					// terminalt operator 
		
		//names.stream().map(v->v.toLowerCase()).forEach(v->System.out.println(v));
		//names.stream().filter(v->v.contains("e")).forEach(v->System.out.println(v));
		//long ll = names.stream().filter(v->v.startsWith("R")).count();
		//System.out.println("Number of names start with R character "+ll);
		//boolean res = names.stream().anyMatch(v->v.startsWith("B"));
		//System.out.println(res);
//		boolean res = names.stream().allMatch(v->v.length()>2);
//		System.out.println(res);
		List<String > updatedNames = names.stream().map(v->v.toLowerCase()).collect(Collectors.toList());
		updatedNames.forEach(v->System.out.println(v));
	}

}
