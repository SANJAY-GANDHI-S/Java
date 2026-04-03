package com.search;

public class LinearSearch {

    public static void main(String[] args) {

    }

    public int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] == target )
                return i;
        }
        return -1;
    }

    public int searchInRange(int[] arr, int target, int start, int end) {
        if ( end < arr.length) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if ( arr[i] == target )
                return i;
        }
        return -1;
    }

    public int[] searchIn2DArray(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ( arr[i][j] == target ) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    public int findMaxValueIn2DArray(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ( arr[i][j] > max ) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    public int findMinValueIn2DArray(int[][] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ( arr[i][j] < min ) {
                    min = arr[i][j];
                }
            }
        }
        return min;
    }

    // LeetCode 1295
    public int findEvenDigitCount(int[] nums) {
        int evenDigitCount = 0;
        for(int i=0; i < nums.length; i++) {
            int count = 0;
            int num = nums[i];
            while(num > 0) {
                count++;
                num = num / 10;
            }
            if(count%2==0){
                evenDigitCount++;
            }
        }
        return evenDigitCount;
    }

    // LeetCode 1672
    public int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for(int i = 0; i < accounts.length; i++) {
            int wealth = 0;
            for(int j = 0; j < accounts[i].length; j++) {
                wealth += accounts[i][j];
            }
            if (maxWealth < wealth) {
                maxWealth = wealth;
            }
        }
        return maxWealth;
    }
}
