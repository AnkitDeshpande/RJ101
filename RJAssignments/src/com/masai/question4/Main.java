package com.masai.question4;

//InterfaceOne with methodOne
interface InterfaceOne {
	void methodOne();
}

//InterfaceTwo with methodTwo
interface InterfaceTwo {
	void methodTwo();
}

//InterfaceThree extending InterfaceOne and InterfaceTwo
interface InterfaceThree extends InterfaceOne, InterfaceTwo {
	void methodThree();
}

//Abstract class ClassOne implementing InterfaceThree
abstract class ClassOne implements InterfaceThree {
	@Override
	public void methodThree() {
		System.out.println("Inside methodThree of ClassOne");
	}
}

//Concrete class ClassTwo extending ClassOne
class ClassTwo extends ClassOne {
	@Override
	public void methodOne() {
		System.out.println("Inside methodOne of ClassTwo");
	}

	@Override
	public void methodTwo() {
		System.out.println("Inside methodTwo of ClassTwo");
	}

	@Override
	public String toString() {
		return "This is ClassTwo object";
	}
}

//Main class
public class Main {
	public static void main(String[] args) {
		// Take a reference variable of InterfaceThree and assign the object of ClassTwo
		InterfaceThree interfaceThree = new ClassTwo();

		// Print the object of InterfaceThree (variable of InterfaceThree)
		System.out.println(interfaceThree);

		// Call the methodOne(), methodTwo(), and methodThree() on the InterfaceThree
		// variable
		interfaceThree.methodOne();
		interfaceThree.methodTwo();
		interfaceThree.methodThree();

		// Take a reference variable of InterfaceOne and assign the object of ClassTwo
		InterfaceOne interfaceOne = new ClassTwo();

		// Call the methodOne() on the InterfaceOne variable
		interfaceOne.methodOne();

		// Downcast the InterfaceOne reference variable to the ClassTwo object
		ClassTwo classTwo = (ClassTwo) interfaceOne;

		// With the object of ClassTwo, call the methodTwo() and methodThree()
		classTwo.methodTwo();
		classTwo.methodThree();
	}
}
