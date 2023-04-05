package com.aorez.leetcode;

import org.junit.Test;

public class 剑指Offer11旋转数组的最小数字 {

    @Test
    public void test() {
        int[] a = {3, 3, 1, 3};
        Solution solution = new Solution();
        int i = solution.minArray(a);
        System.out.println(i);
    }

    class Solution {
        public int minArray(int[] numbers) {
            int left = 0;
            int right = numbers.length - 1;
            while (left < right) {
                int mid = (left + right) >>> 1;
                if (numbers[mid] < numbers[right]) {
                    right = mid;
                } else if (numbers[mid] > numbers[right]) {
                    left = mid + 1;
                } else {
                    right--;
                }
            }
            return numbers[left];
        }
    }
}