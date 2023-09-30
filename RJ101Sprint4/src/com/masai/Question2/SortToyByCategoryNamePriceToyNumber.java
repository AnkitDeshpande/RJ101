package com.masai.Question2;

import java.util.Comparator;

class SortToyByCategoryNamePriceToyNumber implements Comparator<Toy> {
	@Override
	public int compare(Toy toy1, Toy toy2) {
		int categoryComparison = toy1.getCategory().compareTo(toy2.getCategory());
		if (categoryComparison != 0) {
			return categoryComparison;
		}

		int nameComparison = toy1.getToyName().compareTo(toy2.getToyName());
		if (nameComparison != 0) {
			return nameComparison;
		}

		int priceComparison = Double.compare(toy1.getPrice(), toy2.getPrice());
		if (priceComparison != 0) {
			return priceComparison;
		}

		return toy1.getToyNumber().compareTo(toy2.getToyNumber());
	}
}
