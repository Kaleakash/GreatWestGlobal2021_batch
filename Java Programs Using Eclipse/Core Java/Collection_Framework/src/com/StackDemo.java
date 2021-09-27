package com;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack ss =new Stack();
		System.out.println("is empty" +ss.isEmpty());
		ss.push(100);
		ss.push(200);
		ss.push(300);
		ss.push(400);
		System.out.println(ss);
		System.out.println("remove using pop "+ss.pop());
		System.out.println(ss);
		System.out.println(" to check top elements "+ss.peek());
		System.out.println(ss);
		System.out.println(" Search "+ss.search(300));
		System.out.println(" Search  "+ss.search(400));
	}

}
