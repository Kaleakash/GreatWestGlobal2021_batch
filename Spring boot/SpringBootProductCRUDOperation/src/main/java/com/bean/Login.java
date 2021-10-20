package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Login {
@Id
private String email;
private String pass;
private String typeOfUser;
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
public String getTypeOfUser() {
	return typeOfUser;
}
public void setTypeOfUser(String typeOfUser) {
	this.typeOfUser = typeOfUser;
}
}
