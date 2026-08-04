package com.tnsif.lambdaexpression;

interface Result{
	String check(int marks);
}

public class StudentResult {
public static void main(String[] args) {
	Result r=marks->{
		if(marks>=35)
			return "pass";
		else
			return "fail";
					
	};
	System.out.println(r.check(60));
}
}
