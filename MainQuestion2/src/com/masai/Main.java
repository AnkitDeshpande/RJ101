package com.masai;

public class Main {
	public static void main(String[] args) {
		// FeeExpenses example
		FeeExpenses feeExpenses = new FeeExpenses(5000, 10);
		double totalFee = feeExpenses.getTotalFee();
		System.out.println("Total Fee without Cess: " + totalFee);

		// FeeWithCess example
		FeeWithCess feeWithCess = new FeeWithCess(5000, 10, 5);
		totalFee = feeWithCess.getTotalFee();
		System.out.println("Total Fee with Cess: " + totalFee);
	}
}
