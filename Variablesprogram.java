package com.tnsif.scannerclassprograms;

import java.util.Scanner;

// demo for scanner class

public class Scannerdemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); //object
		
		System.out.println("enter the int value");
		int a = sc.nextInt(); // to read int value
		
		System.out.println("enter the float value");
		float f = sc.nextFloat();
		
		System.out.println("enter the name");
		String s=sc.nextLine();
	}

}
