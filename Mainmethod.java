package com.tnsif.accessmodifiers;
// demo for public , private , protected , default
public class Test {
	
	public int s=5;
	
	//private String d="Dev"; 
	
	protected float g=5.6f;
	
	int y=80;//default
	
	public static void main(String[] args) {
		Test t=new Test ();
		
		System.out.println(t.s);
	//	System.out.println(t.d);
		System.out.println(t.g);
		System.out.println(t.y);
	}

}
