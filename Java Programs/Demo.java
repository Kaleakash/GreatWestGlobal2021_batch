class Bike {
	void speed() {
		System.out.println("60km/hr");
	}
}
class Honda extends Bike{				// re-usability 
	void color() {
		System.out.println("Red");
	}
}
class Pulsar extends Bike{
	@Override
	void speed() {				// method overriding 
		System.out.println("90km/hr");
	}
	void color() {
		System.out.println("Black");
	}
}
class Tvs extends Bike{
	@Override
	void speed() {
		super.speed();			// calling super class speed() method.  so merge the code 	
		System.out.println("20km/hr");
	}
	void color() {
		System.out.println("gray");
	}
}
class Demo {
	public static void main(String args[]) {
	Honda hh = new Honda();		hh.color();		hh.speed();
	Pulsar pu = new Pulsar();		pu.color();		pu.speed();	
	Tvs tv = new Tvs();			tv.color();		tv.speed();
	}
}