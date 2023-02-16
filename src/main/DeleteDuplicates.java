package main;
import java.util.ArrayList;
import java.util.List;

public class DeleteDuplicates {

	/*
	 * This method deletes duplicates from a sorted ArrayList.
	 * Nums is the sorted ArrayList with duplicates.
	 * Return the sorted ArrayList without duplicates
	 */
	public static List<Integer> deleteDuplicates(List<Integer> nums) {
		// Check if the list is null or empty, and return an empty list if so
		if (nums.isEmpty()) {
			return nums;
			 
		}

		// Initialize a pointer 'i' to keep track of the unique elements
		int i = 0;

		// Iterate through the list using another pointer 'j'
		for (int j=1; j<nums.size();j++) {
			// If the current element at 'j' is not equal to the previous element at 'i',
			// increment 'i' and set the current element at 'j' to the new position at 'i'
			if (nums.get(j)!=nums.get(i)) {
				i++;
				nums.set(i, nums.get(j));
				 
			}
		
		}

		// Return the sublist from the beginning to 'i + 1', as this will contain all unique elements
		return nums.subList(0, i + 1);
	}

	public static void main(String[] args) {
		// Initialize a sample sorted ArrayList with duplicate values
		List<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(3);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(5);

		// Call the deleteDuplicates method with the sample list as argument
		List<Integer> result = deleteDuplicates(nums);

		// Print the result to the console
		System.out.println(result);
	}
}