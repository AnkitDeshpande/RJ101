package com.masai;

public class Main {
	public static void main(String[] args) {
		// BasicPlan example
		BasicPlan basicPlan = new BasicPlan(99, 50);
		int hoursWatched = 60; // Example: User watched for 60 hours
		basicPlan.setHoursWatched(hoursWatched);
		double totalCharges = basicPlan.getTotalCharges();
		System.out.println("Total Charges for Basic Plan: " + totalCharges);

		// BasicPlanWithGoldAddOn example
		BasicPlanWithGoldAddOn goldAddOnPlan = new BasicPlanWithGoldAddOn(99, 75, 50);
		hoursWatched = 80; // Example: User watched for 80 hours
		goldAddOnPlan.setHoursWatched(hoursWatched);
		totalCharges = goldAddOnPlan.getTotalCharges();
		System.out.println("Total Charges for Basic Plan with Gold Add-On: " + totalCharges);

		// BasicPlanWithGoldDiamondAddOn example
		BasicPlanWithGoldDiamondAddOn diamondAddOnPlan = new BasicPlanWithGoldDiamondAddOn(99, 120, 50, 40);
		hoursWatched = 130; // Example: User watched for 130 hours
		diamondAddOnPlan.setHoursWatched(hoursWatched);
		totalCharges = diamondAddOnPlan.getTotalCharges();
		System.out.println("Total Charges for Basic Plan with Gold and Diamond Add-On: " + totalCharges);
	}
}
