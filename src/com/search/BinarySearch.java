package com.search;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] a = {1,3};
        System.out.println(bs.search(a, 2));
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

    public static int binarySearchAseAndDesd(int[] arr, int target, boolean isAsd, int start, int end) {
        while ( start <= end ) {
            int mid = start + ( end - start ) / 2;
            if(isAsd) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if ( target > arr[mid] ) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if ( target < arr[mid] ) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }

        return -1;
    }

    public static int binarySearchInRange(int[] arr, int target, int start, int end) {

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

    // Leet Code 34
    public int[] searchRange(int[] nums, int target) {
        int start = findIndexNumber34(nums, target, true);
        int end = -1;
        if(start != -1) {
            end = findIndexNumber34(nums, target, false);
        }
        return new int[]{start, end};
    }

    public int findIndexNumber34(int[] nums, int target, boolean findFirstIndex) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + ( end - start ) / 2;
            if ( nums[mid] > target ) {
                end = mid - 1;
            } else if ( nums[mid] < target ) {
                start = mid + 1;
            } else {
                ans = mid;
                if ( findFirstIndex ) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }

    //Find Position of an element in sorted array of infinite numbers

    public int findPositionInInfiniteArray(int[] arr, int target) {
        int[] range = findRange( arr, target );
        return binarySearchInRange(arr, target, range[0], range[1]);
    }

    public int[] findRange(int[] nums, int target) {
        int start = 0;
        int end = 1;

        while ( nums[end] < target ) {
            int temp = end;
            end = end + ( end - start + 1 ) * 2;
            start = temp;
        }

        return new int[]{ start, end};
    }

    // Leet Code 852
    public int findPeakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length -1;

        while ( start < end ) {
            int mid = start + ( end - start ) / 2;
            if( arr[mid] > arr[mid + 1] ) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    // Leet Code 1095
    public int findInMountainArray(int target, int[] mountainArr) {
        int peakElement = findPeakIndexInMountainArray(mountainArr);
        int ans = binarySearchAseAndDesd(mountainArr, target, true, 0, peakElement);
        if(ans == -1) {
            ans = binarySearchAseAndDesd(mountainArr, target, false, peakElement, mountainArr.length -1);
        }
        return ans;
    }

    // Leet Code 33
    public int search(int[] nums, int target) {

        int pivot = findPivot(nums);

        if (pivot == -1) {
            return binarySearchInRange(nums, target, 0, nums.length - 1);
        }

        if ( nums[pivot] == target ) {
            return pivot;
        }

        if ( nums[0] <= target ) {
            return binarySearchInRange(nums, target, 0, pivot);
        }

        return binarySearchInRange(nums, target, pivot + 1, nums.length - 1);
    }

    public int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length -1;

        while ( start <= end ) {
            int mid = start + ( end - start ) / 2;
            if( mid < end && arr[mid] > arr[mid + 1] ) {
                return mid;
            }
            if ( mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if ( arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
