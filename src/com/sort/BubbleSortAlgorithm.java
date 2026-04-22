package com.sort;

import java.util.Arrays;

public class BubbleSortAlgorithm {

    public static void main(String[] args) {
        BubbleSortAlgorithm bs = new BubbleSortAlgorithm();

        int[] arr = { 2, 5, 1, 20, 10, 9, 8};
        bs.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // YouTube Link: https://www.youtube.com/shorts/y2AghjB4Wxs
    public void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if ( arr[j] < arr[j - 1] ) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

}
