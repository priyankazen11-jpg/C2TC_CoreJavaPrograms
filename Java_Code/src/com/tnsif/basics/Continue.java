package com.tnsif.basics;

public class Continue {
	
	public static void main(String[] args) {
		for (int k = 3; k < 20; k++)
		{
		// Odd numbers are skipped
		if (k%2 != 0)
		continue;
		// Even numbers are printed
		System.out.print(k + " ");
		}
	}	
}
