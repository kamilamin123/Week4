package main;

import java.util.ArrayList;

public class ArrayListLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0; i < 5; i++) {
            arr.add(i);
        }
       int i;
        for(i=0; i < arr.size(); i++) {//the for loop iterate but the size change every time because of the remove 
            if (i % 2 == 0) {
                
                arr.remove(i);
            }
        }
        arr.remove(i);
        System.out.println(arr);

	}

}
