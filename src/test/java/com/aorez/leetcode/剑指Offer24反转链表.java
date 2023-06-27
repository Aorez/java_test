package com.aorez.leetcode;

public class 剑指Offer24反转链表 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    //1 > 2 > 3 > 4 > null
    //3 > 4 > null
    //4 > 3
    //3 > 2
    //2 > 1
    //1 > null
    class Solution {
        public ListNode reverseList(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }

            ListNode newHead = reverse(head);
            head.next = null;
            return newHead;
        }

        public ListNode reverse(ListNode node) {
            if (node.next.next == null) {
                node.next.next = node;
                return node.next;
            }

            ListNode head = reverse(node.next);
            node.next.next = node;
            return head;
        }
    }
}
