package com.masai.Question2;

public class InvalidToyNumberException extends Exception {
	public InvalidToyNumberException() {
		super("Invalid toy number, not according to format");
	}
}