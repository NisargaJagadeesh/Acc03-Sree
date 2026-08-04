package com.tnsif.lambdaexpression;

import java.util.function.Consumer;

//takes a data but does not return anything
public class Consumerdemo {
public static void main(String[] args) {
	Consumer<String> e=name->{System.out.println("employee Name"+name);
	
	};
	e.accept("Rahul");
}
}
