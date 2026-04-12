package com.sort;

import java.util.Arrays;

public class InsertionSortAlgorithm {
    public static void main(String[] args) {
        InsertionSortAlgorithm is = new InsertionSortAlgorithm();

        int[] arr = { 2, 5, 1, 20, 10, 9, 8, 6};
        is.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // YouTube Link: https://www.youtube.com/shorts/ZZ-Oz1IFfPg
    public void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int j = i + 1;
            while ( j > 0 ) {
                if ( arr[j] < arr[j -1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
                j--;
            }
        }

    }

    public void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
