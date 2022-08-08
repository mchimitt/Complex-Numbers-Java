package com.chimitt.complexnumbers;

import com.chimitt.complexnumbers.Complex;

public class Main {

	
	public static void main(String [] args) {
		Complex a = new Complex(5, 6);
		Complex b = new Complex(-3, 4);
		Complex c = a.mult(b);
		System.out.println(c.toString());
		c = a.add(b);
		System.out.println(c.toString());
		c = a.sub(b);
		System.out.println(c.toString());
		c = a.div(b);
		System.out.println(c.toString());
	}
	
}
