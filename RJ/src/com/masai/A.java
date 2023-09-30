package com.masai;

import java.util.Arrays;

public class A {

	public static void main(int i) {
		System.out.println("inside main(int)");
	}

	public static void main(String[] args) { /** this method will be called by the jvm to execute */
		System.out.println("Inside real main method" + " " + Arrays.toString(args));

		// can u overload the main method? ---> yes but jvm will only call this method.
		main(10);
	}
}
