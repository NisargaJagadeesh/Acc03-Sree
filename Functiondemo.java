package com.tnsif.lambdaexpression;

import java.util.function.Function;

//used to convert one value into another
public class Functiondemo {
	public static void main(String[] args) {
		Function<Double,Double> as=salary->salary*12;
		System.out.println(as.apply(5000.0));
	}

}
