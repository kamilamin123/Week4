package main;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4};
		System.out.println(sumArr(arr,0));

	}

	private static int sumArr(int[] arr, int i) {
		// TODO Auto-generated method stub
		if (i==arr.length) {
			return 0;
		}
		return arr[i]+sumArr(arr,++i);
	}

}
