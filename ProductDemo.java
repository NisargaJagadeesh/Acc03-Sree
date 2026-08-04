package com.tnsif.lambdaexpression;

import java.util.ArrayList;
import java.util.List;

class product{
	String name;
	int price;
	
	public product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "product [name=" + name + ", price=" + price + "]";
	}
	
	
}
public class ProductDemo {
public static void main(String[] args) {
	List<product> p=new ArrayList<product>();
	
	p.add(new product("Laptop",70000));
	p.add(new product("Mouse",6000));
	p.add(new product("Keyboard",15000));
	
	p.sort((p1,p2)->p1.price-p2.price);
	for(product j:p) {
		System.out.println(j);
	}
}
}
