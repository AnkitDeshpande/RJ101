package com.masai;


class BasicPlanWithGoldDiamondAddOn extends BasicPlanWithGoldAddOn {
    private double diamondAddOnCharges;

    public BasicPlanWithGoldDiamondAddOn(double subscriptionCharge, int hoursWatched, double goldAddOnCharges, double diamondAddOnCharges) {
        super(subscriptionCharge, hoursWatched, goldAddOnCharges);
        this.diamondAddOnCharges = diamondAddOnCharges;
    }

    @Override
    public double getTotalCharges() {
        int extraHours = getHoursWatched() - 120;
        if (extraHours > 0) {
            return super.getTotalCharges() + diamondAddOnCharges + (extraHours * 0.9);
        } else {
            return super.getTotalCharges() + diamondAddOnCharges;
        }
    }
}