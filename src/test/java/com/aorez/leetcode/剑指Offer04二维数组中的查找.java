package com.aorez.leetcode;

import org.junit.Test;

import java.util.Arrays;

public class 剑指Offer04二维数组中的查找 {
    @Test
    public void test() {
    }

    class Solution {

        public boolean binarySearch(int[][] matrix, int target, int col) {
            int right = matrix.length - 1;
            int left = 0;
            while (left <= right) {
                int mid = (left + right) >>> 1;
                int midVal = matrix[mid][0];
                if (target < midVal) {
                    right = mid - 1;
                }
                else if (target > midVal) {
                    left = mid + 1;
                }
                else return true;
            }
            return false;
        }

        public boolean findNumberIn2DArray(int[][] matrix, int target) {
            if (matrix.length == 0) {
                return false;
            }

            if (matrix.length == 1) {
                return Arrays.binarySearch(matrix[0], target) >= 0;
            }

            if (matrix[0].length == 1) {
                return binarySearch(matrix, target, 0);
            }

            int row = 0;
            int col = matrix[0].length - 1;
            while (row < matrix.length && col >= 0) {
                int val = matrix[row][col];
                if (target < val) {
                    col--;
                }
                else if (target > val) {
                    row++;
                }
                else return true;
            }
            return false;
        }
    }
}