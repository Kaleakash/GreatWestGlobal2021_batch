package com;

public class MyException extends Exception{
	public MyException() {
		// TODO Auto-generated constructor stub
	}
	public MyException(String msg) {
		super(msg);		// pass the message to Exception super class constructor
	}
}
