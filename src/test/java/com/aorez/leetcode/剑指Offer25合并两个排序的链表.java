package com.aorez.leetcode;

public class 剑指Offer25合并两个排序的链表 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    //Double pointer
    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if (l1 == null) {
                return l2;
            }
            if (l2 == null) {
                return l1;
            }

            ListNode head;
            if (l1.val < l2.val) {
                head = l1;
                l1 = l1.next;
            }
            else {
                head = l2;
                l2 = l2.next;
            }

            ListNode cur = head;
            while (l1 != null && l2 != null) {
                if (l1.val < l2.val) {
                    cur.next = l1;
                    l1 = l1.next;
                }
                else {
                    cur.next = l2;
                    l2 = l2.next;
                }
                cur = cur.next;
            }

            if (l1 != null) {
                cur.next = l1;
            }
            if (l2 != null) {
                cur.next = l2;
            }

            return head;
        }
    }
}
