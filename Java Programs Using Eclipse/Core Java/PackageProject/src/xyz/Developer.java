package xyz;
import abc.Employee;
public class Developer extends Employee{
	public void disDev() {
		//System.out.println("a "+a);	// private 
		//System.out.println("b "+b);	//default 
		System.out.println("c "+c);
		System.out.println("d "+d);
	}
}
