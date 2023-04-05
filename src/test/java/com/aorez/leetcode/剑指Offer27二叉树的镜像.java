package com.aorez.leetcode;

/*
1
2 3
4 5 6 7
8 9 a b c d e f

1
3 2
7 6 5 4
f e d c b a 9 8
 */

import java.util.Stack;

public class 剑指Offer27二叉树的镜像 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    class Solution {
        public TreeNode mirrorTree(TreeNode root) {
            if (root == null) {
                return null;
            }
            TreeNode node = new TreeNode(root.val);
            node.right = mirrorTree(root.left);
            node.left = mirrorTree(root.right);
            return node;
        }
    }

    class Solution2 {
        public TreeNode mirrorTree(TreeNode root) {
            if (root == null) {
                return null;
            }

            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);
            while (!stack.empty()) {
                TreeNode node = stack.pop();
                if (node.left != null) {
                    stack.push(node.left);
                }
                if (node.right != null) {
                    stack.push(node.right);
                }

                TreeNode n = node.left;
                node.left = node.right;
                node.right = n;
            }

            return root;
        }
    }
}
