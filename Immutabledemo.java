package com.tnsif.polymorphism;


class Food{
	void prepare() {
		System.out.println("preparing food");
	}
}
class Pizza extends Food {
	@Override
	void prepare() {
		System.out.println("preparing pizza");
	}
}
class Burger extends Food {
	@Override
	void prepare() {
		System.out.println("preparing Burger");
	}
}

public class HotelMenu {

	public static void main(String[] args) {
		Pizza p=new Pizza();
		p.prepare();
		Burger b=new Burger();
		b.prepare();
	}
}
