package com.basic;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        // Array
        //   An array in Java is a fixed-size, indexed collection of elements of the same data type, where each element can be accessed using its index (position).
        //
        //Key points
        //  -All elements must be of the same type (e.g., int, String)
        //  -The size is fixed once the array is created
        //  -Elements are stored in contiguous memory locations
        //  -Indexing starts from 0
//        arrayMethods();

        int[] arr = { 1, 2, 3, 4, 5, 6};
        max(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void arrayMethods() {
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        System.out.println(array.length);
        System.out.println(Arrays.toString(array));

        // System.out.println(array[5]); will get ArrayIndexOutOfBoundsException because array length is 5

        int[][] array2D = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9, 10}
        };

        for (int[] arr : array2D){
            System.out.println(Arrays.toString(arr));
        }
    }

    static void max(int[] arr) {
        int srt = 0;
        int end = arr.length - 1;
        while (srt < arr.length / 2) {
            int temp = arr[srt];
            arr[srt] = arr[end];
            arr[end] = temp;
            srt++;
            end--;
        }
    }
}
