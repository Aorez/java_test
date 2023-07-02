package com.aorez.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class 剑指Offer31栈的压入弹出序列 {
    //Simulation
    class Solution {
        public boolean validateStackSequences(int[] pushed, int[] popped) {
            int popLen = popped.length;
            int pushLen = pushed.length;
            int pushIndex = 0;
            Deque<Integer> deque = new ArrayDeque<>();
            for (int i = 0; i < popLen; i++) {
                if (!deque.isEmpty() && deque.peek() == popped[i]) {
                    deque.pop();
                }
                else {
                    while (pushIndex < pushLen && pushed[pushIndex] != popped[i]) {
                        deque.push(pushed[pushIndex]);
                        pushIndex++;
                    }
                    if (pushIndex >= pushLen) {
                        return false;
                    }
                    else {
                        pushIndex++;
                    }
                }
            }
            return true;
        }
    }
}