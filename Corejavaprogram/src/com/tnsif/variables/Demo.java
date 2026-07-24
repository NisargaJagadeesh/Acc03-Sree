package com.tnsif.variables;
// demo for object creation
public class Demo {
	
	String name; //declaration
	int price;
	
	void display() { // method
		System.out.println("food name : "+ name);
		System.out.println("Food price : "+ price);
		
	}
	
	//main method
	public static void main(String[] args) {
		// create a object
		Demo d1 = new Demo () ;
		d1.name="Nisarga";
		d1.price=90;
		
		Demo d2 = new Demo () ;
		d2.name="Ankitha";
		d2.price=60;
		
		d1.display(); // method call
		d2.display();
	}

}
