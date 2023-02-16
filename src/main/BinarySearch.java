package main;

import java.util.ArrayList;

public class BinarySearch {
	  // Function to perform binary search on ArrayList
	  public static int binarySearch(ArrayList<Integer> list, int key) {
	    // Initialize low and high pointers for the start and end of the list respectively
		  int low=0;
		  int high=list.size()-1;
	    int middle;
	    // Keep looping until the high pointer is greater than or equal to the low pointer
		  while(high>=low) {
	      // Calculate the middle index
	     middle=(high+low)/2;
	      
	      // If the element at the middle index is equal to the key, return the index
	    	if (list.get(middle)==key)	 {
	    		return middle;
	      // If the element at the middle index is less than the key, move the low pointer to the middle + 1
	    	}else if(list.get(middle)<key) {
	    		low=middle+1;
	    	
	      // If the element at the middle index is greater than the key, move the high pointer to the middle - 1
	    	}else if (list.get(middle)>key) {
	    		high=middle-1;
	    	}
	    // If the key is not found, return -1
		  }
		  return -1;
	  }
	  
	//Do not modify this code
	  public static void main(String[] args) {
	    // Create an ArrayList of integers
	    ArrayList<Integer> list = new ArrayList<>();
	    list.add(1);
	    list.add(2);
	    list.add(3);
	    list.add(4);
	    list.add(5);
	    
	    // Key to be searched
	    int key = 4;
	    // Perform binary search on the ArrayList
	    int result = binarySearch(list, key);
	    // Print the result
	    if (result == -1) {
	      System.out.println("Element not present in the list");
	    } else {
	      System.out.println("Element found at index " + result);
	    }
	  }
	}