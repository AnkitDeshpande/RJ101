package com.masai.Question2;

public class NoToyException extends Exception {
	public NoToyException() {
		super("No toy in the store");
	}
}