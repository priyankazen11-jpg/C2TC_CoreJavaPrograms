package com.tnsif.basics;

public class DecisionMakingWithOperators {

	public static void main(String[] args) {
		int x = 9, y = 3;
		int a = 16;
		int b = 11;

		if (x >= y) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		if (!(a < b) || (a == b)) {
			System.out.println("Condition is TRUE");
		} else

		{
			System.out.println("Condition is FALSE");
		}
	}
}
