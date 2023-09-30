package com.masai;

public class Student {
	private int roll;
	private String name;
	private int marks;

	public Student(int roll, String name, int marks) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	public void displayStudentDetails() {
		System.out.println("Roll is: " + roll);
		System.out.println("Name is: " + name);
		System.out.println("Marks is: " + marks);
	}

	public static void main(String[] args) {
		Student student1 = new Student(101, "Ankit", 85);
		Student student2 = new Student(102, "Sanket", 92);

		student1.displayStudentDetails();
		System.out.println(); 
		student2.displayStudentDetails();

		student1 = null;
		student2 = null;
	}
}
