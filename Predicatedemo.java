package com.tnsif.lambdaexpression;

import java.util.function.Predicate;

//used for checking a condition
public class Predicatedemo {
public static void main(String[] args) {
	Predicate<Integer> iseligible=age->age>=18;
	System.out.println(iseligible.test(20));
	System.out.println(iseligible.test(15));
}
}
