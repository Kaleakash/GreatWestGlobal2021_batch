class Car {
	Car() {
		System.out.println("Object created...");
	}
	void display() {
		System.out.println("display method");
	}
}
class CarTest {
	public static void main(String args[]) {
	Car innova = new Car();	// heap memory
	innova.display();
	innova.display();
	innova.display();
	innova.display();
	Car swift = new Car();
	swift.display();
	}
}