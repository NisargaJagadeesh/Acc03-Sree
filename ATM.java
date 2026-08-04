package com.tnsif.lambdaexpression;

interface Withdraw{
	double Balance(double currentbalance,double withdrawamount);
}

public class ATM {
	public static void main(String[] args) {
		
		Withdraw w=(b,u)->b-u;
		System.out.println("remaining balance :"+w.Balance(20000, 3000));
	}

}
