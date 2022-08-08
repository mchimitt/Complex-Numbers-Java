package com.chimitt.complexnumbers;

import com.chimitt.complexnumbers.Complex;

public class Main {

	
	public static void main(String [] args) {
		Complex a = new Complex(2, 3);
		Complex b = new Complex(4, -5);
		
		System.out.println("Complex Number 1: " + a.toString());
		System.out.println("Complex Number 2: " + b.toString());
		
		
		
		Complex c = a.add(b);
		System.out.println("Addition: " + c.toString());
		
		c = a.sub(b);
		System.out.println("Subtraction: " + c.toString());
		
		c = a.mult(b);
		System.out.println("Multiplication: " + c.toString());
		
		c = a.div(b);
		System.out.println("Division: " + c.toString());
	
		c = a.conj();
		System.out.println("Conjugate of Complex Number 1: " + c.toString());
		
		c = b.conj();
		System.out.println("Conjugate of Complex Number 2: " + c.toString());
		
		c = a.reciprocal();
		System.out.println("Reciprocal of Complex Number 1: " + c.toString());
		
		c = b.reciprocal();
		System.out.println("Reciprocal of Complex Number 2: " + c.toString());
		
		double e = a.abs();
		System.out.println("Absolute Value of Complex Number 1: " + e);
		
		e = b.abs();
		System.out.println("Absolute Value of Complex Number 2: " + e);
		
	}
	
}
