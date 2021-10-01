package com;
class Outer {
	int a;
	void dis1() {
		System.out.println("This is dis1 non static method");
	}
	class Inner {			// number of copies equal to number of outer class object. 
		void dis2() {
			System.out.println("This is dis2 non static inner class method");
		}
	}
	static class StaticInner {		// only one copy of class 
		void dis3() {
			System.out.println("This is dis3 static inner class method");
		}
	}
}
public class InnerClassDemo {
	public static void main(String[] args) {
	Outer out = new Outer();
	out.dis1();
	//Outer.Inner in = out.new Inner();			// syntax to create inner class object 
	Outer.Inner in = new Outer().new Inner();	// another syntax to create inner class object 
	in.dis2();
	Outer.StaticInner sin = new Outer.StaticInner();		// syntax to create static inner class object 
	sin.dis3();
	}

}
