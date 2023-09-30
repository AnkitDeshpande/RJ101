package com.masai.question1;

class Main {
	public static void main(String[] args) {
		// Create an array of Animal class with size 3
		Animal[] animals = new Animal[3];

		// Initialize the elements of the Animal array with Dog, Cat, and Tiger objects
		animals[0] = new Dog();
		animals[1] = new Cat();
		animals[2] = new Tiger();

		// Call the eat, walk, and makeNoise methods from all the 3 objects
		for (Animal animal : animals) {
			animal.eat();
			animal.walk();
			animal.makeNoise();
			System.out.println("-------------------");
		}
	}
}