package com.tnsif.multipleinheritance;

// two interface 
interface one {
	void show();
	
}
interface two {
	void display();
}
class Example implements one, two {
	@Override
	public void show () {
		System.out.println("Showing the answer");
	}
	
	@Override
	public void display () {
		System.out.println("Answer Displayed Successfully");
	}
	
}

public class MultipleInheritanceDemo  {

	public static void main(String[] args) {
	Example obj = new Example();
	obj.show();
	obj.display();

	}

}
