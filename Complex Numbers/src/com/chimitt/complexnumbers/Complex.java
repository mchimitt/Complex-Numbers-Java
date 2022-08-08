package com.chimitt.complexnumbers;

public class Complex {
	
	private final double re;
	private final double im;
	
	public Complex(double real, double imaginary) {
		this.re = real;
		this.im = imaginary;		
	}
	
	public String toString() {
		if(im == 0) return re + "";
		if(re == 0) return im + "i";
		if(im < 0) return re + " - " + (-im) + "i";
		return re + " + " + im + "i";
	}
	
	public Complex add(Complex b) {
		Complex a = this;
		double real = a.re + b.re;
		double imag = a.im + b.im;
		return new Complex(real, imag);
	}
	
	public Complex sub(Complex b) {
		Complex a = this;
		double real = a.re - b.re;
		double imag = a.im - b.im;
		return new Complex(real, imag);
	}
	
	public Complex mult(Complex b) {
		Complex a = this;
		double real = a.re*b.re - a.im*b.im;
		double imag = a.re*b.im + a.im*b.re;
		return new Complex(real, imag);
	}
	
	public Complex div(Complex b) {
		Complex a = this;
		return a.mult(b.reciprocal());
	}
	
	public Complex reciprocal() {
		double scale = re*re + im*im;
		return new Complex(re / scale, -im / scale);
	}
	
	public Complex conj() {
		return new Complex(re, -im);
	}
	
	public double abs() {
		return Math.hypot(re, im);
	}
	
}
