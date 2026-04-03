package com.search;

public class BinarySearch {

    public static void main(String[] args) {
        int[] a = { 1, 3, 5, 9, 11, 13};
        System.out.println(binarySearch(a, 9));
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while ( start <= end ) {
            int mid = start + ( end - start ) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if ( target < arr[mid] ) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
