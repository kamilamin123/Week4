package main;
import java.util.Arrays;

public class SelectionSort {

	// Method to perform selection sort on an array of integers;
	public static void selectionSort(int[] arr) {

		int n = arr.length;

		// Loop through the array from index 0 to n-1
		for (int i = 0; i < n - 1; i++) {
          // Assume the current index is the minimum 
		int minIndex=i;
		// Loop through the unsorted part of the array
				for(int j = i + 1; j < n; j++) {
				
		// If the current element is less than the assumed minimum, update the minimum index
					if(arr[j]<arr[minIndex]) {
						minIndex=j;
					}
		//Swap the minimum element with the current element
				}
		int temp=arr[minIndex];
		arr[minIndex]=arr[i];
		arr[i]=temp;

		}

	}
// Do not modify below code
	public static void main(String[] args) {

		// Create an array of integers
		int[] arr = { 64, 25, 12, 22, 11 };

		// Print the array before sorting
		System.out.println("Array before sorting " + Arrays.toString(arr));

		selectionSort(arr);
		
		// Print the array after sorting
		System.out.println("Array after sorting " + Arrays.toString(arr));

	}
}