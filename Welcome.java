package com.tnsif.lambdaexpression;
//demo for lambda expression without parameter

@FunctionalInterface
interface Demo{
	void display();
}


public class Welcome {
	public static void main(String[] args) {
		Demo d=()->System.out.println("Welcome to java lambda");
		d.display();
	}

}
