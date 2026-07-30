package com.tnsif.encapsulation;

public class BankAccount {
	
	private String accountholder; // variables
	private double balance;
	
	// getter and setter
	public String getAccountholder() {
		return accountholder;
	}
	public void setAccountholder(String accountholder) {
		this.accountholder = accountholder;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	// methods
	public void deposit(double amount) {
		balance=balance+amount;
	}
	
	public void withdraw(double amount) { //method
		if(amount<=balance) {
			balance=balance-amount;
		}
		else {
			System.out.println("insufficient balance");
		}
	}
	

}
