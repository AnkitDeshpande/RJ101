package com.masai;

public class MultiThreading {
	void fun1() {

	}

	void fun2() {

	}

	void fun3() {

	}

	// scheduling is a task where each thread a given particular set of time to get
	// executed which is allocated by sceduler.
	//types of sceduler -> OS sceduler, Thread sceduler(part of JVM).

	public static void main(String[] args) {  // default thread -> main thread. which is responsible to start main method.
		MultiThreading m1 = new MultiThreading();
		m1.fun1(); // this will be excecuted first.
		m1.fun2(); // this will be excecuted second. and so on
		m1.fun3();

		Thread t1 = new Thread();
		t1.start();
		
		/**
		 * Note: In Java, every program/application has a default flow of execution, a
		 * default thread, it is called the main thread. if we can start another flow of
		 * execution(another thread) along with the main thread simultaneously then it
		 * is called a multithreaded application or program.
		 */	}
}
