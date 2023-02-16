package main;

public class InsertionSort {
    // This method sorts an array in ascending order using insertion sort algorithm
    public static void insertionSort(int[] arr) {
    	
    	// Check if the array is null or has less than 1 element
        if (arr.length<1) {
            // Return if the array is null or has less than 1 element
            return;
        }
        // Loop through the array starting from index 1 to length of the array
        for (int i=1; i<arr.length;i++) {
            // Store the current element
            int currentElement=arr[i];
            // Initialize j with i - 1
           int j=i-1;
            // Inner loop to compare current element with elements before it in the array
            while (j>=0 && arr[j]>currentElement ) {
                // Shift the element to the right
                arr[j+1]=arr[j];
                // Decrement j to compare with next element
               j--;
            }
            // Insert the current element at its correct position
            arr[j+1]=currentElement;
        }
    }
   public static void insertionSortDec(int[] arr) {
    	
  
        insertionSort(arr);
        int i=0;
        
        while (i < arr.length-1)
        {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
            i++;
        }
    }
  //Do not modify below code
    public static void main(String[] args) {
        // Initialize the array
        int[] arr = {3, 4, 1, -2, 4, 8};
        // Call the sort method to sort the array
        insertionSortDec(arr);
        // Print the sorted array
        System.out.println("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

