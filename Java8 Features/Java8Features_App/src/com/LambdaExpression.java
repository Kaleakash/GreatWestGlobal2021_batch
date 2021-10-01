package com;
@FunctionalInterface
interface Operation {
	public int add(int x, int y);
}
public class LambdaExpression {
	public static void main(String[] args) {
		Operation op1 = (int x, int y)->x+y;
		System.out.println(op1.add(1, 2));
		Operation op2 = (int a, int b)->a+b;
		System.out.println(op2.add(3, 4));
		Operation op3 = (m,n)->m+n;
		System.out.println(op3.add(5, 6));
		Operation op4 = (m,n)-> {
				int sum = m+n;
				return sum;
		};
		System.out.println(op4.add(7, 8));
	}

}
