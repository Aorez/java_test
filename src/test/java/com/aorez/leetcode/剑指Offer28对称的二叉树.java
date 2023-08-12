package com.aorez.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 剑指Offer28对称的二叉树 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    //Simulation
    class Solution {
        public boolean isSymmetric(TreeNode root) {
            if (root == null) {
                return true;
            }
            List<TreeNode> nodes = new ArrayList<>();
            nodes.add(root.left);
            nodes.add(root.right);
            while (!nodes.isEmpty()) {
                int half = nodes.size() / 2;
                for (int i = 0; i < half; i++) {
                    if (!eq(nodes.get(i), nodes.get(nodes.size() - 1 - i))) {
                        return false;
                    }
                }

                List<TreeNode> temp = new ArrayList<>();
                for (TreeNode node : nodes) {
                    if (node != null) {
                        temp.add(node.left);
                        temp.add(node.right);
                    }
                }
                nodes = temp;
            }
            return true;
        }

        public boolean eq(TreeNode node1, TreeNode node2) {
            if (node1 == null) {
                return node2 == null;
            }
            if (node2 == null) {
                return node1 == null;
            }
            return node1.val == node2.val;
        }
    }

    @Test
    public void test() {
        TreeNode third1 = new TreeNode(3);
        TreeNode third2 = new TreeNode(3);
        TreeNode third3 = new TreeNode(3);
        TreeNode third4 = new TreeNode(3);

        TreeNode second1 = new TreeNode(2);
        TreeNode second2 = new TreeNode(2);
        second1.left = third1;
        second1.right = third2;
        second2.left = third3;
        second2.right = third4;

        TreeNode root = new TreeNode(1);
        root.left = second1;
        root.right = second2;

        Solution solution = new Solution();
        System.out.println(solution.isSymmetric(root));
    }

    //Left subtree and right subtree
    class Solution2 {
        public boolean isSymmetric(TreeNode root) {
            if (root == null) {
                return true;
            }
            return check(root.left, root.right);
        }

        public boolean check(TreeNode node1, TreeNode node2) {
            if (node1 == null && node2 == null) {
                return true;
            }
            if (node1 == null || node2 == null) {
                return false;
            }
            return node1.val == node2.val && check(node1.left, node2.right) && check(node1.right, node2.left);
        }
    }

    @Test
    public void test2() {
        TreeNode third1 = new TreeNode(3);
        TreeNode third2 = new TreeNode(3);
        TreeNode third3 = new TreeNode(3);
        TreeNode third4 = new TreeNode(3);

        TreeNode second1 = new TreeNode(2);
        TreeNode second2 = new TreeNode(2);
        second1.left = third1;
        second1.right = third2;
        second2.left = third3;
        second2.right = third4;

        TreeNode root = new TreeNode(1);
        root.left = second1;
        root.right = second2;

        Solution2 solution = new Solution2();
        System.out.println(solution.isSymmetric(root));
    }

    //Non recursion left tree and right tree
    class Solution3 {
        public boolean isSymmetric(TreeNode root) {
            if (root == null) {
                return true;
            }

            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root.left);
            queue.offer(root.right);
            TreeNode left, right;
            while (!queue.isEmpty()) {
                left = queue.poll();
                right = queue.poll();
                if (left == null && right == null) {
                    continue;
                }
                if (left == null || right == null || left.val != right.val) {
                    return false;
                }

                queue.offer(left.left);
                queue.offer(right.right);
                queue.offer(left.right);
                queue.offer(right.left);
            }
            return true;
        }
    }

    @Test
    public void test3() {
        TreeNode third1 = new TreeNode(3);
        TreeNode third2 = new TreeNode(3);
        TreeNode third3 = new TreeNode(3);
        TreeNode third4 = new TreeNode(3);

        TreeNode second1 = new TreeNode(2);
        TreeNode second2 = new TreeNode(2);
        second1.left = third1;
        second1.right = third2;
        second2.left = third3;
        second2.right = third4;

        TreeNode root = new TreeNode(1);
        root.left = second1;
        root.right = second2;

        Solution3 solution = new Solution3();
        System.out.println(solution.isSymmetric(root));
    }
}
