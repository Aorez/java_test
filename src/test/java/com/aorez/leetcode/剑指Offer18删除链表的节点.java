package com.aorez.leetcode;

public class 剑指Offer18删除链表的节点 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    //Traverse the linked list
    class Solution {
        public ListNode deleteNode(ListNode head, int val) {
            if (head == null) {
                return null;
            }

            if (head.val == val) {
                return head.next;
            }

            ListNode node = head;
            //The end of linked list----It is the val given
            while (node.next != null && node.next.val != val) {
                node = node.next;
            }

            //If val is not in the linked list, node.next will be null
            if (node.next != null) {
                node.next = node.next.next;
            }

            return head;
        }
    }

    //Double pointer
    class Solution2 {
        public ListNode deleteNode(ListNode head, int val) {
            if (head == null) {
                return null;
            }
            if (head.val == val) {
                return head.next;
            }

            ListNode pre = head, cur = head.next;
            while (cur != null && cur.val != val) {
                pre = cur;
                cur = cur.next;
            }
            if (cur != null) {
                pre.next = cur.next;
            }

            return head;
        }
    }
}
