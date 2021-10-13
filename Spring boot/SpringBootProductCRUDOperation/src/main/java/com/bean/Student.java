package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
@Id
private int sid;
private String sname;
private int age;
private int tsid;
private int csid;
public int getTsid() {
	return tsid;
}
public void setTsid(int tsid) {
	this.tsid = tsid;
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getCsid() {
	return csid;
}
public void setCsid(int csid) {
	this.csid = csid;
}

}
