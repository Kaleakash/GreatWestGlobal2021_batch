package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component()					// normal or java bean class. // id is employee 
@Component("obj")
public class Employee {			
private int id;
private String name;
@Autowired
private Address add;

	public Address getAdd() {
	return add;
}

public void setAdd(Address add) {
	this.add = add;
}

	public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}



	@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", add=" + add + "]";
}

	public void display() {
		System.out.println("this is simple employee class display method");
	}
}
