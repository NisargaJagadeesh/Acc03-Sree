package com.tnsif.exceptionhandlng;

public class Nullpointerdemo {
	public static void main(String[] args) {
		String customer=null;
		try {
			System.out.println(customer.length());
		}
		catch(NullPointerException h) {
			System.out.println(h);
		}
	}

}
