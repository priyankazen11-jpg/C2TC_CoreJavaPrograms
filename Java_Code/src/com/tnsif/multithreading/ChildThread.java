package com.tnsif.multithreading;

public class ChildThread extends Thread {
	private int n;
	private String  msg; //data members


public ChildThread (int n, String msg) {
	this.n = n;
	this.msg = msg;
	
}
@Override 
public void run () {
	for (int i = 1; i <=n; i++) {
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			System.err.println("Thread interrupted :");
		}
		System.out.println(msg + i +" " + Thread.currentThread().getName());
	}
}
}
