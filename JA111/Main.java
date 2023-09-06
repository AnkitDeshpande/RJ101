package JA111;
abstract class Animal {
    public abstract void makeNoise();

    public void eat() {
        System.out.println("Animal is eating");
    }

    public void walk() {
        System.out.println("Animal is walking");
    }
}

class Dog extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Barking...");
    }
}

class Cat extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Meow...");
    }
}

class Tiger extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Roaring...");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an array of Animal class with size 3
        Animal[] animals = new Animal[3];

        // Initialize all 3 elements of this Animal class with Dog, Cat, and Tiger class objects.
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Tiger();

        // Call the methods (eat, walk, makeNoise) from all the 3 objects.
        for (Animal animal : animals) {
            animal.eat();
            animal.walk();
            animal.makeNoise();
            System.out.println(); // Add a newline for separation
        }
    }
}
