package com.tnsif.Streamapiprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//demo for Stream api programs
public class EvenNumbers {
	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(10,25,67,90,34,90,6,7,8,47);
		List<Integer> even=numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println("even numbers in the list :"+even);
	}

}
