package com.masai;

public class Main {
	public static void main(String[] args) {
		// FixedDepositAccount example
		FixedDepositAccount fdAccount = new FixedDepositAccount(10000, 5);
		double maturityValue = fdAccount.calculateMaturityValue();
		System.out.println("Maturity Value: " + maturityValue);

		// LoanAgainstFixedDepositAccount example
		LoanAgainstFixedDepositAccount loanAccount = new LoanAgainstFixedDepositAccount(10000, 5, 5000, 8);
		double totalPayment = loanAccount.calculateTotalPayment();
		System.out.println("Total Payment: " + totalPayment);
	}
}
