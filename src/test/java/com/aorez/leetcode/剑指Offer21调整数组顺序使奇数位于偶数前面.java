package com.aorez.leetcode;

public class 剑指Offer21调整数组顺序使奇数位于偶数前面 {
    //Double pointer
    //[1, 2, 3, 4]
    //First even index 1
    //Traverse the left numbers
    //Once odd, exchange this odd with even index even
    //even index++
    class Solution {
        public int[] exchange(int[] nums) {
            //Find the first even
            int evenIndex = -1;
            for (int i = 0; i < nums.length; i++) {
                if (isEven(nums[i])) {
                    evenIndex = i;
                    break;
                }
            }
            //No even in the array
            if (evenIndex == -1) {
                return nums;
            }

            int index = evenIndex + 1;
            while (index < nums.length) {
                //Exchange even and odd
                if (isOdd(nums[index])) {
                    int n = nums[index];
                    nums[index] = nums[evenIndex];
                    nums[evenIndex] = n;
                    evenIndex++;
                }
                index++;
            }

            return nums;
        }

        public boolean isEven(int n) {
            return n % 2 == 0;
        }

        public boolean isOdd(int n) {
            return n % 2 != 0;
        }
    }

    //Double pointer simplified
    class Solution2 {
        public int[] exchange(int[] nums) {
            //Find the first even
            int evenIndex = -1;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] % 2 == 0) {
                    evenIndex = i;
                    break;
                }
            }
            //No even in the array
            if (evenIndex == -1) {
                return nums;
            }

            int index = evenIndex + 1;
            while (index < nums.length) {
                //Exchange even and odd
                if (nums[index] % 2 != 0) {
                    int n = nums[index];
                    nums[index] = nums[evenIndex];
                    nums[evenIndex] = n;
                    evenIndex++;
                }
                index++;
            }

            return nums;
        }
    }
}
