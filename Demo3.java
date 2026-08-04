package com.tnsif.lambdaexpression;


interface Add{
	int add(int a,int b);
}
public class Demo3 {
	public static void main(String[] args) {
		
		Add obj=(a,b)->a+b;
		System.out.println("sum of a number :"+obj.add(3, 2));
		}

}
