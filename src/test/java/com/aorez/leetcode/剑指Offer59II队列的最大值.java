package com.aorez.leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class 剑指Offer59II队列的最大值 {
    //Humdrum queue
    class MaxQueue {
        Deque<Integer> humdrum;
        Deque<Integer> queue;

        public MaxQueue() {
            humdrum = new LinkedList<>();
            queue = new LinkedList<>();
        }

        public int max_value() {
            return humdrum.isEmpty() ? -1 : humdrum.peekFirst();
        }

        public void push_back(int value) {
            queue.offer(value);
            while (!humdrum.isEmpty() && humdrum.peekLast() < value) {
                humdrum.pollLast();
            }
            humdrum.offerLast(value);
        }

        public int pop_front() {
            if (queue.isEmpty()) {
                return -1;
            }
            if (humdrum.peekFirst().equals(queue.peek())) {
                humdrum.pollFirst();
            }
            return queue.poll();
        }
    }
}