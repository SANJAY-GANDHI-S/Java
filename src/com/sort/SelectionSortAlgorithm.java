package com.sort;

import java.util.Arrays;

public class SelectionSortAlgorithm {
    public static void main(String[] args) {
        SelectionSortAlgorithm ss = new SelectionSortAlgorithm();

        int[] arr = { 2, 5, 1, 20, 10, 9, 8};
        ss.selectionSortForMin(arr);
        System.out.println(Arrays.toString(arr));

    }

    // YouTube Link: https://www.youtube.com/shorts/HRwi5gwlB0U
    public void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int maxValue = 0;
            for (int j = 0; j < arr.length - i; j++) {
                if ( arr[maxValue] < arr[j] ) {
                    maxValue = j;
                }
            }
            swap(arr, maxValue, arr.length - i - 1);
        }
    }

    public void selectionSortForMin(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minValue = i;
            for (int j = i; j < arr.length; j++) {
                if ( arr[minValue] > arr[j] ) {
                    minValue = j;
                }
            }
            if ( minValue != i ) {
                swap(arr, i, minValue);
            }
        }
    }

    public void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
