package com.tnsif.Streamapiprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Uppercaseexample {
public static void main(String[] args) {
	List<String> names=Arrays.asList("ravi","kusuma","hani");
	List<String> result = names.stream().map(String::toUpperCase).collect(Collectors.toList());
	System.out.println(result);
}
}
