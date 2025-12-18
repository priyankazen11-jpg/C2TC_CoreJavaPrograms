package com.tnsif.oops.inheritance;

class A {
	void display() {
		System.out.println("hello world");
	}
}
class B extends A {
	
}
class C extends A {

}
public class Inheritance {

	public static void main(String[] args) {
		C obj = new C ();
		obj.display();
		A fun = new A ();
		fun.display();
	}

}
