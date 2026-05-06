package com.leetcode;

import java.util.Arrays;

public class LeetCodeSolution {

    public static void main(String[] args) {
        LeetCodeSolution lc = new LeetCodeSolution();

        String[] strs = { "flower","flow","flight" };
        int[] arr = {3,2,3};
        lc.moveZeroes(arr);
        System.out.println(lc.majorityElement(arr));
    }

    // LeetCode 01: https://leetcode.com/problems/two-sum/description/
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j <= nums.length - 1; j++) {
                int sum = nums[i] + nums[j];
                if(sum == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    // LeetCode 07: https://leetcode.com/problems/reverse-integer/description/
    public int reverse(int x) {
        int num = x;
        int ans = 0;

        if ( x <= 0) {
            num = num * -1;
        }

        while ( num > 0 ) {
            int temp = num % 10;
            if ( ans > Integer.MAX_VALUE / 10 || ans < Integer.MIN_VALUE / 10) {
                return 0;
            }
            num = num / 10;

            ans = ( ans * 10 ) + temp;
        }

        if ( x < 0 ) {
            ans = ans * -1;
        }

        return ans;
    }

    // LeetCode 09: https://leetcode.com/problems/palindrome-number/description/
    public boolean isPalindrome(int x) {
        int num = x;
        int ans = 0;

        if ( x < 0) {
            return false;
        }

        while ( num > 0 ) {
            int temp = num % 10;
            num = num / 10;

            ans = ( ans * 10 ) + temp;
        }

        return x == ans;
    }

    // Leet Code 26: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
    public int removeDuplicates(int[] nums) {
        int count = 0;
        int nonDuplicate = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if ( nonDuplicate != nums[i] ) {
                nums[count] = nums[i];
                nonDuplicate = nums[i];
                count++;
            }
        }

        return count;
    }

    // Leet Code 27: https://leetcode.com/problems/remove-element/description/
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if ( nums[i] != val ) {
                nums[count] = nums[i];
                count++;
            }
        }

        return count;
    }

    // Leet Code 28: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
    public int strStr(String haystack, String needle) {
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    // Leet Code 35: https://leetcode.com/problems/search-insert-position/description/
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while ( start <= end ) {
            int mid = start + ( end - start ) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if ( target > nums[mid] ) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return  start;
    }

    public String longestCommonPrefix(String[] strs) {
        String ans = strs[0];

        for (int i = 1; i < strs.length; i++) {
            StringBuilder s = new StringBuilder();
            for (int j = 0; j < strs[i].length(); j++) {
                int len = ans.length();
                if( len > j && ans.charAt(j) == strs[i].charAt(j) ) {
                    s.append(ans.charAt(j));
                } else {
                    break;
                }
            }
            ans = s.toString();
        }

        return ans;
    }

    // Leet Code 66: https://leetcode.com/problems/plus-one/description/
    public int[] plusOne(int[] digits) {
        int len = digits.length - 1;

        while ( len >= 0 ) {
            if ( digits[len] < 9 ) {
                digits[len]++;
                return digits;
            }
            digits[len] = 0;
            len--;
        }

        int[] ans = new int[digits.length + 1];
        ans[0] = 1;

        return ans;
    }

    // LeetCode 136: https://leetcode.com/problems/single-number/
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int i : nums) {
            ans = ans ^ nums[i];
        }
        return ans;
    }

    // LeetCode 169: https://leetcode.com/problems/majority-element/description/
    public int majorityElement(int[] nums) {
        int count = 0;
        int ans = -1;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                ans = nums[i];
            }
            if (ans == nums[i]) {
                count++;
            } else {
                count--;
            }
        }

        return ans;
    }

    // Leet Code 189: https://leetcode.com/problems/rotate-array/description/
    public void rotate(int[] nums, int k) {
        if(nums.length == 1) {
            return;
        }
        k = k % nums.length;
        reverseArray(nums, 0, nums.length -1);
        reverseArray(nums, 0, k - 1);
        reverseArray(nums, k, nums.length - 1);
    }

    public void reverseArray(int[] arr, int start, int end) {
        while ( start < end ) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    // LeetCode 258: https://leetcode.com/problems/add-digits/description/
    public int addDigits(int num) {
        int addNum = 0;
        while ( num > 0 ) {
            int temp = num % 10;
            addNum += temp;
            num /= 10;
        }
        if ( addNum >= 10 ) {
            return addDigits(addNum);
        }
        return addNum;
    }

    // LeetCode 283: https://leetcode.com/problems/move-zeroes/description/
    public void moveZeroes(int[] nums) {
        if (nums.length == 1) {
            return;
        }
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[count];
                nums[count] = nums[i];
                nums[i] = temp;
                count++;
            }
        }
    }

    // LeetCode 231: https://leetcode.com/problems/power-of-two/description/
    // LeetCode 326: https://leetcode.com/problems/power-of-three/description/
    // LeetCode 342: https://leetcode.com/problems/power-of-four/description/
    public boolean isPowerOfTwo(int n) {
        double num = 0;
        double pow = 0;
        while (n >= pow){
            pow = Math.pow(2, num);
            if ( pow == n ) {
                return true;
            }
            num++;
        }
        return false;
    }

    // Leet Code 344: https://leetcode.com/problems/reverse-string/description/
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;

        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start++;
            end--;
        }
    }

    //Leet Code 345: https://leetcode.com/problems/reverse-vowels-of-a-string/description/
    public String reverseVowels(String s) {
        int start = 0;
        int end = s.length() - 1;
        char[] ch = s.toCharArray();

        while ( start < end ) {
            if (!isVowel(ch[start])) {
                start++;
            } else if (!isVowel(ch[end])) {
                end--;
            } else {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
        }

        return String.valueOf(ch);
    }

    public boolean isVowel(char ch) {
        if ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        }

        return false;
    }

    // Leet Code 507: https://leetcode.com/problems/perfect-number/description/
    public boolean checkPerfectNumber(int num) {
        if (num <= 1) {
            return false;
        }
        int i = 2;
        int addNum = 1;

        while ( i  <= num / 2 ) {
            if ( num % i == 0 ) {
                addNum += i;
            }
            i++;
        }

        return num == addNum;
    }

    // Leet Code 509: https://leetcode.com/problems/fibonacci-number/description/
    public int fib(int n) {
        if ( n == 0) {
            return 0;
        }
        if ( n == 1 ) {
            return 1;
        }
        int a = 0;
        int b = 1;
        int sum = a + b;

        while ( n > 1 ) {
            sum = a + b;
            a = b;
            b = sum;

            n--;
        }

        return sum;
    }

    // Leet Code 1295: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
    public int findNumbers(int[] nums) {
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
}
