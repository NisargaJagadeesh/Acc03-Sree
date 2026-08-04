package com.tnsif.lambdaexpression;


interface salary{
	double calculate(double monthlysalary);
}

public class Emplyeesalary {
	public static void main(String[] args) {
		salary annualsalary=Salary->Salary*12;
		System.out.println("Annual salary :"+annualsalary.calculate(40000));
	}

}
