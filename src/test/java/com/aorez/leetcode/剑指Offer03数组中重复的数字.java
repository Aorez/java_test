package com.aorez.leetcode;

import java.util.HashSet;
import java.util.Set;

public class 剑指Offer03数组中重复的数字 {

    /**
     * Hash set
     */
    class Solution {
        public int findRepeatNumber(int[] nums) {
            Set<Integer> set = new HashSet<>();
            for (int num : nums) {
                if (set.contains(num)) {
                    return num;
                } else {
                    set.add(num);
                }
            }
            return 0;
        }
    }

    /**
     * Exchange
     */
    class Solution2 {
        public int findRepeatNumber(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                while (nums[i] != i) {
                    int temp = nums[i];
                    if (nums[temp] == temp) {
                        return temp;
                    }
                    nums[i] = nums[temp];
                    nums[temp] = temp;
                }
            }
            return 0;
        }
    }
}
