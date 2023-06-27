package com.aorez.leetcode;

public class 剑指Offer06从尾到头打印链表 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    class Solution {
        public int[] reversePrint(ListNode head) {
            if (head == null) {
                return new int[]{};
            }

            return putIntoArray(head, 1);
        }

        public int[] putIntoArray(ListNode node, int id) {
            if (node.next == null) {
                int[] array = new int[id];
                array[0] = node.val;
                return array;
            }

            int[] array = putIntoArray(node.next, id + 1);
            array[array.length - id] = node.val;
            return array;
        }
    }
}
