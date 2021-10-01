package com;
@FunctionalInterface
interface A {
	abstract void dis1();
	//void dis2();
	default void dis3() {}
	static void dis4() {}
}
public class FuctionInterfaceDemo {

	public static void main(String[] args) {


	}

}
