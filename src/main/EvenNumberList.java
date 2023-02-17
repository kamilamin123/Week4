package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberList {
    public static void main(String[] args) {
        // Create a list of integers
    	List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        
        // Use the stream method to convert the list to a stream of integers, then use the filter method to keep only the even numbers in the stream, and finally use the collect method to convert the filtered stream back into a list of integers
    	List<Integer> evenList= list.stream()
    			.filter(num->num%2==0)
    			.collect(Collectors.toList());
    			
        
                                     
        
        // Print the original list and the new list containing only the even numbers
        System.out.println("Original list: " + list);
        System.out.println("Even numbers list: " + evenList);
    }
}
