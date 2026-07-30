package com.tnsif.interfacedemo;
// demo for nested interface
public interface Myinterface {
	
	void calculatearea();  //abstract methods
	
	interface Myinnerinterface{
		int id=20;  //public static final
		void print();
	}

}