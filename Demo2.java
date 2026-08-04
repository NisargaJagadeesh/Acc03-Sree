package com.tnsif.lambdaexpression;

// with parameter

@FunctionalInterface
interface Square{
	int findsquare(int n);
}

public class Demo2 {
	public static void main(String[] args) {
		Square s=(n)->n*n;
		System.out.println("square of a number "+s.findsquare(2));
	}

}
