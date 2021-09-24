package booking;
class Booking extends Thread{
		int avl=1;
		@Override
		public synchronized void run() {
			Thread t = Thread.currentThread();
			String name  = t.getName();
			if(avl==1) {
				System.out.println(name+" got the ticket");
				avl=avl-1;
			}else {
				System.out.println(name+" no ticket");
			}	}}
public class Test {
	public static void main(String[] args) {
		Booking bb1 = new Booking();			// new memory created avl=1
		//Booking bb2 = new Booking();				// new memory created avl=1
		//Booking bb3 = new Booking();				// new memory created avl = 1
		Thread t1 = new Thread(bb1);		t1.setName("Raj"); t1.start();
		Thread t2 = new Thread(bb1);	  	t2.setName("Reeta"); t2.start();
		Thread t3 = new Thread(bb1);		t3.setName("Ajay"); t3.start();	
	}
}

