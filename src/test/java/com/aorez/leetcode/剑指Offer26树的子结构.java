package com.aorez.leetcode;

public class 剑指Offer26树的子结构 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    class Solution {
        public boolean isSubStructure(TreeNode A, TreeNode B) {
            if (B == null || A == null) {
                return false;
            }

            if (match(A, B)) {
                return true;
            }

            if (isSubStructure(A.left, B) || isSubStructure(A.right, B)) {
                return true;
            }

            return false;
        }

        //对节点进行匹配
        public boolean match(TreeNode A, TreeNode B) {
            if (B == null) {
                return true;
            }

            if (A == null) {
                return false;
            }

            if (A.val != B.val) {
                return false;
            }

            if (match(A.left, B.left) && match(A.right, B.right)) {
                return true;
            }

            return false;
        }
    }
}
