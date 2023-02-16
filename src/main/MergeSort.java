package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class MergeSort {
	public static void main(String[] args) {

		Random rand = new Random();
		int[] numbers = new int[10];
		ArrayList<Integer> nums= new ArrayList<>();

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(100);
			nums.add(rand.nextInt(100));
		}
		System.out.println("Before:");
		System.out.println(nums);
		quickSort(nums);
		System.out.println("\nAfter:");
		System.out.println(nums);
		
//		
//
//		System.out.println("Before:");
//		printArray(numbers);
//
//		bubbleSort(numbers); 
//
//		System.out.println("\nAfter:");
//		printArray(numbers);
//		 
	}
	private static void bubbleSort(int[] inputArray) {
		for(int k =inputArray.length-1;k>=0;k--) {
			int i=0;

			while (i<k) {
				if(inputArray[i]>inputArray[i+1]) {
					int temp=inputArray[i];
					inputArray[i]=inputArray[i+1];
					inputArray[i+1]=temp;
					printArray(inputArray);

				}
				i++;

			}
		}
	}

	private static void mergeSort(int[] inputArray) {
		int inputLength = inputArray.length;
		if(inputLength<=1) {
			return;
		}
		int mid =inputLength/2;
		int[] left=new int[mid];
		int[] right=new int[inputLength-mid];
		for (int i=0; i<mid;i++) {
			left[i]=inputArray[i];
		}
		for (int i=mid; i<inputLength;i++) {
			right[i-mid]=inputArray[i];
		}
		mergeSort(left);
		mergeSort(right);

		int leftIndex=0, rightIndex=0, inputIndex=0; //left right and input index 
		int leftLength=left.length; 
		int rightLength=right.length;
		while(leftIndex<leftLength && rightIndex<rightLength) {
			if(left[leftIndex]<=right[rightIndex]) {
				inputArray[inputIndex]=left[leftIndex];
				leftIndex++;
			}else {
				inputArray[inputIndex]=right[rightIndex];
				rightIndex++;
			}
			inputIndex++;
		}
		if(rightIndex==rightLength-1) {
			while(rightIndex<rightLength) {
				inputArray[inputIndex]=right[rightIndex];
				rightIndex++;
				inputIndex++;
			}}
		if(leftIndex==leftLength-1) {
			while(leftIndex<leftLength) {
				inputArray[inputIndex]=left[leftIndex];
				leftIndex++;
				inputIndex++;
			}
		}


	}
	private static void quickSort(ArrayList<Integer> arr) {
		if (arr.size()<=1) {
			return;
		}
		int pivot= arr.get(0);
		ArrayList<Integer> left=new ArrayList<>();
		ArrayList<Integer> right=new ArrayList<>();
		for (int i=1;i<arr.size();i++){
			if (arr.get(i)>pivot) {
				right.add(arr.get(i));
			}else {
				left.add(arr.get(i));
			}
		}
		quickSort(left);
		quickSort(right);
		
		arr.clear();
		arr.addAll(left);
		arr.add(pivot);
		arr.addAll(right);
		}




	private static void printArray(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]+", ");
		}
		System.out.println();
	}
}

