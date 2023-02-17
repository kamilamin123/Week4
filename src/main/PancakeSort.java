package main;

import java.util.Arrays;

public class PancakeSort {
    public static void sort(int[] arr) {
        for (int i = arr.length; i > 1; i--) {
            int maxIndex = findMaxIndex(arr, i);
            if (maxIndex != i - 1) {
                flip(arr, maxIndex);
                flip(arr, i - 1);
            }
        }
    }

    private static int findMaxIndex(int[] arr, int n) {
        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private static void flip(int[] arr, int n) {
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 1, 7, 8, 9};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
