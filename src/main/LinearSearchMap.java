package main;
import java.util.HashMap;
import java.util.Map;

public class LinearSearchMap {
	// Define a method that takes in a map and a target value as parameters
	public static boolean linearSearch(Map<String, Integer> map, int target) {
		// Iterate through each entry in the map
		for (Integer i :map.values()) {
			// Check if the value of the current entry is equal to the target
			if (i==target) {
				return true;
				// If the value is equal to the target, return true

			}
		}
		// If no entry with the target value is found, return false
		return false;

	}

	public static void main(String[] args) {
		// Create a HashMap of strings and integers
		Map<String, Integer> numbers = new HashMap<>();
		numbers.put("One", 1);
		numbers.put("Two", 2);
		numbers.put("Three", 3);
		numbers.put("Four", 4);
		numbers.put("Five", 5);

		// Populate the HashMap with key-value pairs

		// Set the target value to search for
		int target=3;

		// Call the linearSearch method with the map and target value as parameters
		boolean result = linearSearch(numbers, target);
		// Check if the target was found in the map
		if (result) {
			System.out.println("Target found in the Map.");
		} else {
			System.out.println("Target not found in the Map.");
		}
	}
}
