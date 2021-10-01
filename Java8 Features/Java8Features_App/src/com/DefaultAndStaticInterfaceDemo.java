package com;
interface Bank {
		void withdraw();
		default void gst() {
			System.out.println("Default gst implementation");
		}
		static void loan() {
			System.out.println("loan implementation");
		}
}
class Sbi implements Bank {
	public void withdraw() {
		System.out.println("This is sbi withdraw method");
	}
	static void loan() {
		System.out.println("loan implementation sbi own method");
	}
}
class Hdfc implements Bank {
	public void withdraw() {
		System.out.println("This is Hdfc withdraw method");
	}
	public void gst() {
		System.out.println("Default gst implementation Override by Hdfc class");
	}
}
public class DefaultAndStaticInterfaceDemo {
	public static void main(String[] args) {
		Sbi obj1 = new Sbi();
		obj1.withdraw();
		obj1.gst();
		Bank.loan();
		Sbi.loan();
		Hdfc obj2 = new Hdfc();
		obj2.withdraw();
		obj2.gst();
		Bank.loan();
	}

}
