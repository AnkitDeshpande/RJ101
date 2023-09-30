package com.masai;

class BasicPlan {
	private double subscriptionCharge;
	private int hoursWatched;

	public BasicPlan(double subscriptionCharge, int hoursWatched) {
		this.subscriptionCharge = subscriptionCharge;
		this.hoursWatched = hoursWatched;
	}

	public double getSubscriptionCharge() {
		return subscriptionCharge;
	}

	public void setSubscriptionCharge(double subscriptionCharge) {
		this.subscriptionCharge = subscriptionCharge;
	}

	public void setHoursWatched(int hoursWatched) {
		this.hoursWatched = hoursWatched;
	}

	public int getHoursWatched() {
		return hoursWatched;
	}

	public double getTotalCharges() {
		int extraHours = hoursWatched - 45;
		if (extraHours > 0) {
			return subscriptionCharge + (extraHours * 1.5);
		} else {
			return subscriptionCharge;
		}
	}
}
