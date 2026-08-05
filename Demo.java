package com.tnsif.Streamapiprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo {
public static void main(String[] args) {
	
	List<String> names=Arrays.asList("Anu","Rashmi","Dharshan","Greeshma");
	
	Optional<String> n=names.stream().filter(s->s.startsWith("R")).findFirst();
	
	System.out.println(n.get());
}
}
