package com.masai;

public class Main {
	public static void main(String[] args) {
		// Creating EPFO accounts
		EPFOAccount account1 = new EPFOAccount("EPF001", 25500);
		EPFOAccount account2 = new EPFOAccount("EPF002", 32000);

		// Creating employees with EPFO accounts
		Employee employee1 = new Employee("E001", "Anuj", 45000, account1);
		Employee employee2 = new Employee("E002", "Sarah", 55000, account2);

		// Displaying employee information
		System.out.println(employee1);
		System.out.println(employee2);

		// Testing equals and hashCode methods
		if (employee1.equals(employee2)) {
			System.out.println("Employees are the same.");
		} else {
			System.out.println("Employees are different.");
		}
	}
}
