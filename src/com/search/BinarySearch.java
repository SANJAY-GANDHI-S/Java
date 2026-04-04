package com.search;

public class BinarySearch {

    public static void main(String[] args) {
        int[] a = { 1, 3, 5, 9, 11, 13};
        System.out.println(floor(a, 8));
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while ( start <= end ) {
            int mid = start + ( end - start ) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if ( target > arr[mid] ) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public static int ceilingOfANumber(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while ( start <= end ) {
            int mid = start + ( end - start ) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if ( target > arr[mid] ) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return  start;
    }

    public static int floor(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while ( start <= end ) {
            int mid = start + ( end - start ) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if ( target > arr[mid] ) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return  end;
    }

    // Leet Code 744
    public char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while ( start <= end ) {
            int mid = start + ( end - start ) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return  letters[start % letters.length];

    }
}
