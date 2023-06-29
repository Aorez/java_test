package com.aorez.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class 剑指Offer09用两个栈实现队列 {
    class CQueue {
        Deque<Integer> stackAppend;
        Deque<Integer> stackDelete;

        public CQueue() {
            stackAppend = new ArrayDeque<>();
            stackDelete = new ArrayDeque<>();
        }

        public void appendTail(int value) {
            stackAppend.push(value);
        }

        public int deleteHead() {
            if (stackDelete.isEmpty()) {
                while (!stackAppend.isEmpty()) {
                    stackDelete.push(stackAppend.pop());
                }
            }

            return stackDelete.isEmpty()? -1 : stackDelete.pop();
        }
    }
}