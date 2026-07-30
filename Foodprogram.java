package com.tnsif.scannerclassprograms;

import java.util.Scanner;

// demo for scanner class
public class Employee {
	int empId;
	String Empname;
	double salary;
	
	void display() {
		System.out.println("employee Details :");
		System.out.println("Employee id :"+ empId);
		System.out.println("EmpName :"+ Empname);
		System.out.println("salary :"+ salary);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee e=new Employee();
		
		System.out.println("enter the id");
		e.empId=sc.nextInt();
		sc.nextLine();
		
		System.out.println("enter the name");
		e.Empname=sc.next();
		
		System.out.println("enter the salary");
		e.salary=sc.nextDouble();
		
		e.display();
	}
}
