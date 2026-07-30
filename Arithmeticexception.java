package com.tnsif.constructorprogram;

public class Bookdetail {
	
	Bookdetail() {
		System.out.println("welcome to jaava");
	}
	Bookdetail(int i,String n){
		System.out.println("hello world");
	}
	Bookdetail(int i) {
		System.out.println("hi");
	}
	Bookdetail(int i, float n) {
		System.out.println("good");
		
	}
	public static void main(String[] args) {
		Bookdetail b=new Bookdetail ();
		Bookdetail b1=new Bookdetail (1,9.0f);
		Bookdetail b2=new Bookdetail (2,"nisarga");
	}
}
