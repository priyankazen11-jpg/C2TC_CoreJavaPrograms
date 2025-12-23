package com.tnsif.interfacedemo;

interface one {
	void show();
}
public class InterfaceDemo implements one{
	public void show () {
		System.out.println("displaying output");
	}
	
public static void main (String [] args) {
	InterfaceDemo obj = new InterfaceDemo();
	obj.show();
	 
}
}

