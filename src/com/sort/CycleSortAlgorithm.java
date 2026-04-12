package com.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CycleSortAlgorithm {
    public static void main(String[] args) {
        CycleSortAlgorithm cs = new CycleSortAlgorithm();

        int[] nums = {1,2,2,4};


        System.out.println(Arrays.toString(cs.findErrorNums(nums)));
    }

    public void cycleSort(int[] nums) {
        int i = 0;
        while ( i < nums.length ) {
            int correct = nums[i] - 1;
            if ( nums[i] != nums[correct] ) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            i++;
        }
    }

    // Leet Code 268 : https://leetcode.com/problems/missing-number/description/
    public int missingNumber(int[] nums) {
        int i = 0;
        while ( i < nums.length ) {
            int correct = nums[i];
            if ( nums[i] < nums.length && nums[i] != nums[correct] ) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }
        int number = findIndex(nums);
        return number != -1 ? number : nums.length;
    }

    public int findIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if ( i != nums[i] ) {
                return i;
            }
        }
        return -1;
    }

    // Leet Code 448: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while ( i < nums.length ) {
            int correct = nums[i] - 1;
            if ( nums[i] != nums[correct] ) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }
        return findAllIndex(nums);
    }

    public List<Integer> findAllIndex(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if ( i != nums[i - 1] ) {
                al.add(i);
            }
        }
        return al;
    }

    // Leet Code 287: https://leetcode.com/problems/find-the-duplicate-number/description/
    public int findDuplicate(int[] nums) {
        int i = 0;
        while ( i < nums.length ) {
            int correct = nums[i];
            if ( nums[i] < nums.length && nums[i] != nums[correct] ) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }
        int number = findIndex(nums);
        return number != -1 ? number : nums.length;
    }

    public int findValue(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if ( i != nums[i] ) {
                return nums[i];
            }
        }
        return -1;
    }

    // Leet Code 287: https://leetcode.com/problems/find-the-duplicate-number/description/
    public int findDuplicate02(int[] nums) {
        int n = nums.length;
        int[] freq = new int[n];

        for (int i = 0; i < nums.length; i++) {
            freq[nums[i] - 1]++;
        }

        return findValue02(freq);
    }

    public int findValue02(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if ( nums[i] >= 2) {
                return i + 1;
            }
        }
        return -1;
    }

    // Leet Code 442: https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
    public List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while ( i < nums.length ) {
            int correct = nums[i] - 1;
            if ( nums[i] != nums[correct] ) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }
        return findDuplicatesAllIndex(nums);
    }

    public List<Integer> findDuplicatesAllIndex(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if ( i + 1 != nums[i] ) {
                al.add(nums[i]);
            }
        }
        return al;
    }

    public List<Integer> findDuplicates02(int[] nums) {
        int n = nums.length;
        int[] freq = new int[n];

        for (int i = 0; i < nums.length; i++) {
            freq[nums[i] - 1]++;
        }

        return findDuplicatesAllIndex02(freq);
    }

    public List<Integer> findDuplicatesAllIndex02(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if ( nums[i] >= 2 ) {
                al.add(i + 1);
            }
        }
        return al;
    }

    // Leet Code 645: https://leetcode.com/problems/set-mismatch/
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while ( i < nums.length ) {
            int correct = nums[i] - 1;
            if ( nums[i] != nums[correct] ) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }
        return findErrorNumsAllIndex(nums);
    }

    public int[] findErrorNumsAllIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if ( i + 1 != nums[i] ) {
                return new int[]{ nums[i], i + 1 };
            }
        }
        return new int[]{-1,-1};
    }
}
