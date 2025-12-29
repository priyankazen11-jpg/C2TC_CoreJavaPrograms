package com.tnsif.multithreading;

public class ThreadDemo {

	public static void main(String[] args) {
		ChildThread threadOne = new ChildThread (5, "First");
		ChildThread threadTwo = new ChildThread (10,"Second");
	threadOne.start();
	threadTwo.start();
	System.out.println("--------------------------------" + "End of Main--------------------------------" + "------------------");
		

	}

}
