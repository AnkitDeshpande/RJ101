package com.masai.Question2;

public class ToyCompanyNotFoundException extends Exception {
	public ToyCompanyNotFoundException() {
		super("No company exists for this toy");
	}
}