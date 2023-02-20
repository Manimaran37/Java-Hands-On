package com.wipro.automobile.ship;

public class Compartment {
	double height, width, breadth;
	

	public Compartment(double height, double width, double breadth) {
		this.height = height;
		this.width = width;
		this.breadth = breadth;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Compartment c = new Compartment(100, 150, 200);
		System.out.println("Length = " + c.height + "\nWidth = " + c.width + "\nBreadth = " + c.breadth);
	}

}
