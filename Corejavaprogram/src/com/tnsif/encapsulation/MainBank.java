package com.tnsif.encapsulation;

public class MainBank {
	public static void main(String[] args) {
		BankAccount b=new BankAccount();
		
		b.setAccountholder("Nisarga");
		b.deposit(10000);
		b.withdraw(2500);
		
		System.out.println("account holder "+b.getAccountholder());
		System.out.println("balance "+b.getBalance());
	}

}
 