package com.tnsif.Streamapiprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperation {
public static void main(String[] args) {
	List<Integer> n=Arrays.asList(1,3,4,6,8,23,567,78,45,7,6,65,43,57,56);
	
	//map() : multiple each numbers by 2
	
	List<Integer> d=n.stream().map(n1->n1*2).collect(Collectors.toList());
	System.out.println("doubled numbers :"+d);
	
	//filter() : keep only even numbers
	
	List<Integer> evens=n.stream().filter(s->s%2==0).collect(Collectors.toList());
	System.out.println("even numbers: "+evens);
	
	//Distrint(): remove the duplicates
	List<Integer> du=n.stream().distinct().collect(Collectors.toList());
	System.out.println(du);
	
	//limit() : take only first 5
	List<Integer> limit=n.stream().limit(5).collect(Collectors.toList());
	System.out.println(limit);
	
	//skip() : skip the first 3 number
	
	List<Integer> s=n.stream().skip(3).collect(Collectors.toList());
	System.out.println(s);
	
	
	
}
}
