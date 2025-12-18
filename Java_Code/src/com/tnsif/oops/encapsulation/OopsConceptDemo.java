package com.tnsif.oops.encapsulation;

public class OopsConceptDemo {
//	Var declaration/ Data members
	private int serialNum; //private can be accessble only within the class
	private String name;
	private int age;
	
//	Getter and setter method (bulidin function in java) 
	
	public int getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString( ) {
		return "OopsConceptDemo [Serial Number =" + serialNum + ","+ "name=" + name +",age =" +age+"]";
	}
	


}
