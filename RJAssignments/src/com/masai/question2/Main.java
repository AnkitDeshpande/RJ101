package com.masai.question2;

//Define the Hotel interface
interface Hotel {
	void chickenBiryani();

	void masalaDosa();
}

//Concrete class TajHotel implementing the Hotel interface
class TajHotel implements Hotel {
	@Override
	public void chickenBiryani() {
		System.out.println("Biryani from Taj Hotel");
	}

	@Override
	public void masalaDosa() {
		System.out.println("Masala Dosa from Taj Hotel");
	}

	// Specific method for TajHotel
	public void welcomeDrink() {
		System.out.println("Welcome Drink from Taj Hotel");
	}
}

//Concrete class RoadSideHotel implementing the Hotel interface
class RoadSideHotel implements Hotel {
	@Override
	public void chickenBiryani() {
		System.out.println("Biryani from Road Side Hotel");
	}

	@Override
	public void masalaDosa() {
		System.out.println("Masala Dosa from Road Side Hotel");
	}
}

//Main class
public class Main {
	public Hotel provideFood(int amount) {
		if (amount > 1000) {
			return new TajHotel();
		} else if (amount > 200 && amount <= 1000) {
			return new RoadSideHotel();
		} else {
			return null;
		}
	}

	public static void main(String[] args) {
		Main main = new Main(); // Create the Main class object
		java.util.Scanner scanner = new java.util.Scanner(System.in); // Create Scanner object

		// Prompt the user to enter the amount
		System.out.println("Enter the amount: ");
		int amount = scanner.nextInt();

		// Call the provideFood method on the Main class object by supplying the amount
		Hotel hotel = main.provideFood(amount);

		if (hotel != null) {
			if (hotel instanceof TajHotel) {
				TajHotel tajHotel = (TajHotel) hotel;
				tajHotel.welcomeDrink();
				tajHotel.chickenBiryani();
				tajHotel.masalaDosa();
			} else if (hotel instanceof RoadSideHotel) {
				RoadSideHotel roadSideHotel = (RoadSideHotel) hotel;
				roadSideHotel.chickenBiryani();
				roadSideHotel.masalaDosa();
			}
		} else {
			System.out.println("Please Enter a valid amount.");
		}
	}
}
