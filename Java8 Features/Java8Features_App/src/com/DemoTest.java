package com;
interface Abc {
	void dis1();
	//void dis2();
}
class Demo implements Abc {// logic complex and re-usability 
	public void dis1() {
		System.out.println("Demo class provide the body for dis1() method");
	}
}
public class DemoTest {
	public static void main(String[] args) {
		//1st way 
		Abc obj1 = new Demo();
		obj1.dis1();
		//2nd way 
		Abc obj2 = new Abc() {
			public void dis1() {
				System.out.println("This is Abc interface method body provided by anonymous class");
			}	
		};
		obj2.dis1();
		Abc obj3 = new Abc() {
			public void dis1() {
				System.out.println("This is Abc interface method body provided by anonymous class with different implementation");
			}
		};
		obj3.dis1();
		
		//3rd way 
		Abc obj4 = ()->System.out.println("Lambda expression");
		obj4.dis1();
	}

}
