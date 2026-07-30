package com.tnsif.exceptionhandlng;
//this is an demo for finally block
public class Finaldemo {
	public static void main(String[] args) {
		try {
			System.out.println("welcome to java");
			System.out.println(10/0);
		}
		catch(ArrayIndexOutOfBoundsException y) {
			System.out.println(y);
		}
		finally {
			System.out.println("verygood");
		}
	}

}
