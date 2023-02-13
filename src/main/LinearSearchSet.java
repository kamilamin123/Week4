package main;

import java.util.HashSet;
import java.util.Set;

public class LinearSearchSet {
	// Define a method named linearSearch that takes in a Set and an integer target as parameters
	public static boolean linearSearch(Set<Integer> set, int target) {
		// Iterate over all elements in the Set
		for (Integer i:set) {
			// Check if the current value is equal to the target
			if (i == target) {
				// If so, return true
				return true;
			}
		}
		return false;
		// If the target was not found, return false

	}

	// Define the main method
	public static void main(String[] args) {
		// Create a HashSet of integers and populate integer values
		Set<Integer> numbers = new HashSet<>();
		numbers.add(3);
		numbers.add(6);
		numbers.add(2);
		numbers.add(9);
		numbers.add(11);


		// Define the target to search for
		int target =6;


		// Call the linearSearch method with the set and target as arguments
		boolean result = linearSearch(numbers, target);
		// Check the result and print the appropriate message
		if (result) {
			System.out.println("Target found in the Set.");
		} else {
			System.out.println("Target not found in the Set.");
		}
	}
}

