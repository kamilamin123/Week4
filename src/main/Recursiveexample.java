package main;

public class Recursiveexample {
	 static void recursive(int i) {	
		 System.out.println("before recursive number: " +i);
		 if(i==0) {return;}
		 recursive(i-1);
		System.out.println("after recursive: "+i);}
	 public static void main(String[] args) {
		recursive(3);
	}

}
