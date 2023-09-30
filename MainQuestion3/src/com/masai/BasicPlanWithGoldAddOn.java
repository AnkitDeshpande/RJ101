package com.masai;

class BasicPlanWithGoldAddOn extends BasicPlan {
    private double goldAddOnCharges;

    public BasicPlanWithGoldAddOn(double subscriptionCharge, int hoursWatched, double goldAddOnCharges) {
        super(subscriptionCharge, hoursWatched);
        this.goldAddOnCharges = goldAddOnCharges;
    }

    public double getGoldAddOnCharges() {
        return goldAddOnCharges;
    }

    @Override
    public double getTotalCharges() {
        int extraHours = getHoursWatched() - 75;
        if (extraHours > 0) {
            return super.getTotalCharges() + goldAddOnCharges + (extraHours * 1.2);
        } else {
            return super.getTotalCharges() + goldAddOnCharges;
        }
    }
}
