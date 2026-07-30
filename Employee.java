package com.tnsif.abstractionprogram;
// demo for abstract class

	
	abstract class ATM{ // abstract class
		//abstract methods
		
		abstract void withdraw();
		abstract void deposit ();
		
		//Concrete methods
		void display() {
			System.out.println("Welcome to SBI ATM");
		}

}

class SBIATM extends ATM {
	@Override
	void withdraw() {
		System.out.println("Money withdraw successfully");
	}
	@Override
	void deposit() {
		System.out.println("Money deposited successfully");
	}
}
public class ATMDemo {
	public static void main(String[] args) {
		SBIATM s= new SBIATM();
		
		s.display();
		s.deposit();
		s.withdraw();
	}
}