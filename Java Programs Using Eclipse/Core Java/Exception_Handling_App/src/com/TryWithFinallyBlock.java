package com;

public class TryWithFinallyBlock {

	public static void main(String[] args) {
		System.out.println("Hi");
		try {
			int res = 10/0;
			System.out.println("No Exception");
		} finally {
			System.out.println("finally block");
		}
		System.out.println("Normal Statement");
	}
}
