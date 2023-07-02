package com.aorez.leetcode;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

public class 剑指Offer30包含min函数的栈 {
    class MinStack {
        Deque<Integer> stack;
        Deque<Integer> min;

        public MinStack() {
            stack = new ArrayDeque<>();
            min = new ArrayDeque<>();
        }

        public void push(int x) {
            stack.push(x);
            if (min.isEmpty()) {
                min.push(x);
            }
            else if (x < min.peek()) {
                min.push(x);
            }
            else {
                min.push(min.peek());
            }
        }

        public void pop() {
            stack.pop();
            min.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int min() {
            return min.peek();
        }
    }

    @Test
    public void test() {
        MinStack minStack = new MinStack();
        minStack.push(2);
        System.out.println(minStack.min());
        minStack.push(1);
        System.out.println(minStack.min());
        minStack.pop();
        System.out.println(minStack.min());
    }
}
