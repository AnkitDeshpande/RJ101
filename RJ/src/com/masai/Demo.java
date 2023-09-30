package com.masai;

public class Demo {

	public static void main(String[] args) {
		A.main(null);
		A.main(0);
		
		/**
		 * Note: if we call a real main method of a class manually then it will be
		 * called as a ordinary method. where as if a JVM calls the main method of a
		 * class, in order to execute that class, it will call as a main thread.
		 */
	}

}
