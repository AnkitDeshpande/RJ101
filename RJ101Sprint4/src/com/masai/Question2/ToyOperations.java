package com.masai.Question2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ToyOperations {
	private Map<String, Toy> map = new TreeMap<>();

	private void isToyNumberValid(String toyNumber) throws InvalidToyNumberException, ToyCompanyNotFoundException {
		if (!toyNumber.matches("^[A-Z]{3}\\d{3}$")) {
			throw new InvalidToyNumberException();
		}

		String companyCode = toyNumber.substring(0, 3);
		if (!CompanyNameCode.companyCode.containsKey(companyCode)) {
			throw new ToyCompanyNotFoundException();
		}
	}

	public boolean addToy(String toyNumber, String toyName, Double price, String category)
			throws InvalidToyNumberException, ToyCompanyNotFoundException {
		isToyNumberValid(toyNumber);

		if (map.containsKey(toyName)) {
			return false;
		}

		Toy toy = new Toy(toyNumber, toyName, price, category);
		map.put(toyName, toy);
		return true;
	}

	public List<String> getToysListToDisplay() throws NoToyException {
		if (map.isEmpty()) {
			throw new NoToyException();
		}

		List<Toy> toyList = new ArrayList<>(map.values());
		toyList.sort(new SortToysByPrice());

		List<String> result = new ArrayList<>();
		for (Toy toy : toyList) {
			result.add(toy.toString());
		}

		return result;
	}

	public Toy getToyByToyNumber(String toyNumber)
			throws InvalidToyNumberException, ToyCompanyNotFoundException, NoToyException {
		isToyNumberValid(toyNumber);

		for (Toy toy : map.values()) {
			if (toy.getToyNumber().equals(toyNumber)) {
				return toy;
			}
		}

		throw new NoToyException();
	}

	public List<String> getToyListSortedByPrice() throws NoToyException {
		if (map.isEmpty()) {
			throw new NoToyException();
		}

		List<Toy> toyList = new ArrayList<>(map.values());
		toyList.sort(new SortToyByCategoryNamePriceToyNumber());

		List<String> result = new ArrayList<>();
		for (Toy toy : toyList) {
			result.add(toy.toString());
		}

		return result;
	}

	public List<String> getToyListForGivenPriceRange(Double start, Double end) throws NoToyException {
		if (map.isEmpty()) {
			throw new NoToyException();
		}

		Set<Toy> toySet = new TreeSet<>(new SortToyByCategoryNamePriceToyNumber());
		for (Toy toy : map.values()) {
			if (toy.getPrice() >= start && toy.getPrice() <= end) {
				toySet.add(toy);
			}
		}

		List<String> result = new ArrayList<>();
		for (Toy toy : toySet) {
			result.add(toy.toString());
		}

		return result;
	}
}