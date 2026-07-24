package com.tnsif.scannerclassprograms;

import java.util.Scanner;

public class Product {
	int productId;
	String productname;
	Double productprice;
	
	void display () {
		System.out.println("Product details");
		System.out.println("Product id :"+ productId);
		System.out.println("prdName :"+ productname);
		System.out.println("price :"+ productprice);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Product e=new Product();
		
		System.out.println("enter the id");
		e.productId=sc.nextInt();
		sc.nextLine();
		
		System.out.println("enter the name");
		e.productname=sc.next();
		
		
		System.out.println("enter the price");
		e.productprice=sc.nextDouble();
		
		
		e.display();
	}

}
