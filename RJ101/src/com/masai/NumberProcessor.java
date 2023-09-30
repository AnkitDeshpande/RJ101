package com.masai;

public class NumberProcessor {

	public void processNumber(int number) {
		if (number < 0) {
			System.out.println("Input: " + number + ", output: Error");
		} else if (number % 2 == 0) {
			int nextMultipleOfTen = ((number + 9) / 10) * 10;
			System.out.println("Input: " + number + ", output: " + nextMultipleOfTen);
		} else {
			System.out.println("Input: " + number + ", output: " + number);
		}
	}

	public static void main(String[] args) {
		NumberProcessor pro = new NumberProcessor();

		/** Test cases */
		pro.processNumber(44);
		pro.processNumber(45);
		pro.processNumber(-5);
		
	}
}
