package com.tnsif.Streamapiprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Countstudents {
public static void main(String[] args) {
	
	List<Integer> marks=Arrays.asList(90,23,60,89,45,24,56,78,45,77,66);
	
	 long counts=marks.stream().filter(m->m>75).count();
	 
	 System.out.println("Students passed :"+counts);
}
}
