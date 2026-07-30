package com.tnsif.encapsulation;

public class Main {
	public static void main(String[] args) {
		Student s=new Student (); //obj
		
		s.setId(101);
		s.setName("Nisarga");
		
		System.out.println("Student Id :"+s.getId());
		System.out.println("Student Name :"+s.getName());
	}

}
