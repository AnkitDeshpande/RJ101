package com.masai.Question2;

import java.util.Comparator;

class SortToysByPrice implements Comparator<Toy> {
	@Override
	public int compare(Toy toy1, Toy toy2) {
		return Double.compare(toy1.getPrice(), toy2.getPrice());
	}
}