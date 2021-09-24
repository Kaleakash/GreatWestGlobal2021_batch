package mno;
class A implements Runnable {
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		for(int i=0;i<10;i++) {
			try {
			Thread.sleep(2000);
			}catch (Exception e) {}
			System.out.println(name+"="+i);}}
}
class B implements Runnable {
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		for(int j=0;j<10;j++) {
			try {
				Thread.sleep(1000);
				}catch (Exception e) {}
			System.out.println(name+" "+j);	}}
}
public class Test {
	public static void main(String[] args) {
	A obj1 = new A();
	B obj2 = new B();
	Thread t1 = new Thread(obj1);
	Thread t2 = new Thread(obj2);
	t1.setName("Demo1");
	t2.setName("Demo2");
	t1.setPriority(10);
	t1.setPriority(1);
	t1.start();
	t2.start();
	}

}

