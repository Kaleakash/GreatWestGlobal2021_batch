package com.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Course {
@Id
private int cid;
private String cname;
@OneToMany(mappedBy = "csid")
private List<Student> listOfStudent;
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public List<Student> getListOfStudent() {
	return listOfStudent;
}
public void setListOfStudent(List<Student> listOfStudent) {
	this.listOfStudent = listOfStudent;
}

}
