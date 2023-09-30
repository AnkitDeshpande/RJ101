package com.masai;

public class Lion {
    String name;
    boolean isHungry;
    int age;
    static int totalDeaths;

    static void printKillings() {
        System.out.println("Total killings by lions in the jungle = " + totalDeaths);
    }

    void thinking() {
        if (!isHungry) {
            System.out.println(name + " is sleeping.");
        } else {
            if (age > 12) {
                totalDeaths += 2;
                System.out.println(name + " has eaten two animals.");
            } else if (age >= 2) {
                totalDeaths += 1;
                System.out.println(name + " has eaten one animal.");
            } else {
                System.out.println(name + " is calling Mom.");
            }
        }
    }

    public static void main(String[] args) {
        Lion lion1 = new Lion();
        lion1.name = "lion1";
        lion1.isHungry = true;
        lion1.age = 10;

        Lion lion2 = new Lion();
        lion2.name = "lion2";
        lion2.isHungry = true;
        lion2.age = 15;

        Lion lion3 = new Lion();
        lion3.name = "lion3";
        lion3.isHungry = false;
        lion3.age = 1;

        lion1.thinking();
        lion2.thinking();
        lion3.thinking();

        printKillings();
    }
}
