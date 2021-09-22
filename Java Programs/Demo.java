class A {
	A() {
		System.out.println("A class constructor");	
	}
	{
		System.out.println("init block");
	}
	static {
		System.out.println("Static block");
	}
	void dis1() {
		System.out.println("dis1 method");
	}
	
}
class Demo {
	public static void main(String args[]) {
	A obj1 =new A();
	obj1.dis1();
	obj1.dis1();
	A obj2 = new A();	
	}
}