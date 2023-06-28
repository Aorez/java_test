package com.aorez.leetcode;

public class 剑指Offer22链表中倒数第k个节点 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    //Double pointer
    class Solution {
        public ListNode getKthFromEnd(ListNode head, int k) {
            //Only one node in linked list and to remove the last node
            if (head.next == null && k == 1) {
                return head;
            }

            ListNode first = head, second = head;
            for (int i = 0; i < k; i++) {
                second = second.next;
            }

            while (second != null) {
                first = first.next;
                second = second.next;
            }

            return first;
        }
    }
}
