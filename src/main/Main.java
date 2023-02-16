package main;

import java.util.Arrays;

class Main {

    public static void main(String args[]) {
        int[] arr = { 12, 11, 13, 5, 6, 7 };
        System.out.print("Printing original array: ");
        System.out.println(Arrays.toString(arr));

        // sort array
        mergeSort(arr, 0, arr.length - 1);

        System.out.print("Printing sorted array: ");
        System.out.println(Arrays.toString(arr));

    }

 // Create a merge method to merge two sorted sub-arrays. 
    static void merge(int arr[], int start, int mid, int end) {
        
    	int[] left=new int[mid+1];
        int[] right=new int[end-mid];
    	for(int i=0; i<mid+1;i++) {
    		left[i]=arr[i];
    	}
    	
    	for(int i=mid+1; i<=end;i++) {
    		right[i-mid-1]=arr[i];
    	}
    	
    	// Get sub-arrays from arr, based on the indexes provided - copy values from arr into temp left and right arrays. I
        // While both sub-arrays are not empty, copy the smallest value from either of them into the right position in arr. 
        int i=0,j=0,k=0;
    	while(i<right.length && j<left.length) {
    		if (right[i]<=left[j]) {
    			arr[k]=right[i];
    			i++;
    		}else {
    			arr[k]=left[j];
    			j++;
    		}
    		k++;
    	}
    		while(i<=right.length-1) {
    			arr[k]=right[i];
    			k++;
    			i++;
    	}
    		while(j<=left.length-1) {
    			arr[k]=left[j];
    			k++;
    			j++;
    	}
    	// Then copy the remaining part of the non-empty sub-array into the rest of the space in arr.
    }

    static void mergeSort(int arr[], int start, int end) {
    	 if (start < end) {

    		    int mid = start + (end - start) / 2;
    		    // recursively call mergesort
    		    mergeSort(arr, 0, mid);
    		    mergeSort(arr, mid + 1, end);

    		    // Merge the sorted halves
    		    merge(arr, start, mid, end);
    		  }
    		}}
