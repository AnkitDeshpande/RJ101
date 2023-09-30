package com.masai.question3;

import java.util.Arrays;
import java.util.List;

interface PrintList {
	void display(List<String> city);
}

public class Main {
	public static void main(String[] args) {
		List<String> cities = Arrays.asList("New York", "London", "Paris", "Tokyo", "Sydney");

		// Implement the PrintList interface using a lambda expression
		PrintList printList = (cityList) -> {
			cityList.forEach(c -> System.out.println(c)); //using consumer
		};

		// Call the display method with the list of cities using the lambda expression
		printList.display(cities);
	}
}
