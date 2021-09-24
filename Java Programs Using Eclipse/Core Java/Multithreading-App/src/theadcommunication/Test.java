package theadcommunication;


class Abc extends Thread{
		@Override
		public synchronized void run() {
			Thread t = Thread.currentThread();
			String name  = t.getName();
			for(int i=0;i<10;i++) {
				System.out.println(name+"="+i);
				try {
					Thread.sleep(500);
					if(i==5 && name.equals("Raj")) {
						wait();
					}
					if(i==6 && name.equals("Ajay")) {
						notify();
						wait();
					}
				}catch(Exception e) {}
			}
		}
		}
public class Test {
	public static void main(String[] args) {
		Abc obj = new Abc();
		Thread t1 = new Thread(obj);		t1.setName("Raj"); t1.start();
		Thread t2 = new Thread(obj);	  	t2.setName("Reeta"); t2.start();
		Thread t3 = new Thread(obj);		t3.setName("Ajay"); t3.start();	
	}
}


