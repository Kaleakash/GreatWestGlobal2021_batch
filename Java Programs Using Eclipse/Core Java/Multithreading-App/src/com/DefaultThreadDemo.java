package com;

public class DefaultThreadDemo {

	public static void main(String[] args) {
		Thread t	= Thread.currentThread();
		System.out.println(t);
		t.setName("My Demo Thread");
		t.setPriority(1);
		System.out.println(t);
		String name = t.getName();
		int i = t.getPriority();
		System.out.println(name);
		System.out.println(i);
	}

}
