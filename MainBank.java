package com.tnsif.collectionframework;

import java.util.Vector;

public class Vectordemo {
public static void main(String[] args) {
	
	Vector<String> a1=new Vector<>();
	
	a1.add("Apple");
	a1.add("Mango");
	a1.add("lichi");
	
	a1.addFirst("pineapple");
	a1.addLast("Banana");
	
	System.out.println(a1);
	
	a1.removeLast();
	System.out.println(a1);
}
}
