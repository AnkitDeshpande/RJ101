package com.masai;
class LoanAgainstFixedDepositAccount extends FixedDepositAccount {
    private double loanAmount;
    private double loanInterestRate;

    public LoanAgainstFixedDepositAccount(double depositAmount, double fdInterestRate, double loanAmount, double loanInterestRate) {
        super(depositAmount, fdInterestRate);
        this.loanAmount = loanAmount;
        this.loanInterestRate = loanInterestRate;
    }

    public double calculateTotalPayment() {
        return Math.round((loanAmount + (loanAmount * loanInterestRate) / 100) * 100.0) / 100.0;
    }
}
