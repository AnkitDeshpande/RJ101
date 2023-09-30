package com.masai;

class FixedDepositAccount {
    private double depositAmount;
    private double fdInterestRate;

    public FixedDepositAccount(double depositAmount, double fdInterestRate) {
        this.depositAmount = depositAmount;
        this.fdInterestRate = fdInterestRate;
    }

    public double calculateMaturityValue() {
        return Math.round(depositAmount * (1 + fdInterestRate / 100) * 100.0) / 100.0;
    }
} 

