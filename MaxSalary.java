package com.tnsif.Streamapiprograms;

import java.util.Arrays;
import java.util.List;

public class MaxSalary {
public static void main(String[] args) {
	
	List<Integer> salary=Arrays.asList(500000,80000,12000,300,45000);
	
	int s=salary.stream().max(Integer::compare).get();
	
	System.out.println("highest salary: "+ s);
}
}
