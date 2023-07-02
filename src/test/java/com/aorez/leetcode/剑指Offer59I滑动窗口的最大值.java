package com.aorez.leetcode;

import org.junit.Test;

import java.util.*;

public class 剑指Offer59I滑动窗口的最大值 {
    //Double queue
    class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
            PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    //If value equal return index comparing
                    if (o1[0] == o2[0]) {
                        return o2[1] - o1[1];
                    }
                    //Else return value comparing
                    else {
                        return o2[0] - o1[0];
                    }
                }
            });
            //Firstly offer k-1 elements, the k element offered in the "for"
            for (int i = 0; i < k - 1; i++) {
                priorityQueue.offer(new int[]{nums[i], i});
            }
            int[] result = new int[nums.length - k + 1];
            for (int i = 0; i < result.length; i++) {
                priorityQueue.offer(new int[]{nums[k + i - 1], k + i - 1});
                while (priorityQueue.peek()[1] < i) {
                    priorityQueue.poll();
                }
                result[i] = priorityQueue.peek()[0];
            }
            return result;
        }
    }

    //Reference answer
    class Solution2 {
        public int[] maxSlidingWindow(int[] nums, int k) {
            int n = nums.length;
            PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {
                public int compare(int[] pair1, int[] pair2) {
                    return pair1[0] != pair2[0] ? pair2[0] - pair1[0] : pair2[1] - pair1[1];
                }
            });
            for (int i = 0; i < k; ++i) {
                pq.offer(new int[]{nums[i], i});
            }
            int[] ans = new int[n - k + 1];
            ans[0] = pq.peek()[0];
            for (int i = k; i < n; ++i) {
                pq.offer(new int[]{nums[i], i});
                while (pq.peek()[1] <= i - k) {
                    pq.poll();
                }
                ans[i - k + 1] = pq.peek()[0];
            }
            return ans;
        }
    }

    @Test
    public void test() {
        Solution solution = new Solution();
        int[] a1 = {1,3,-1,-3,5,3,6,7};
        int k1 = 3;
        System.out.println(Arrays.toString(solution.maxSlidingWindow(a1, k1)));
    }

    //Test solution2
    @Test
    public void test2() {
        Solution2 solution2 = new Solution2();
        int[] a1 = {3, 1, 1};
        int k1 = 2;
        System.out.println(Arrays.toString(solution2.maxSlidingWindow(a1, k1)));
    }

    //Humdrum queue
    //last----------------first
    //index max-----------index min
    //value min-----------value max
    //每一次，先加入元素到队尾，如果大于队尾元素，则把队尾元素删除
    //再删除队首元素，如果队首下标太小，则删除
    class Solution3 {
        public int[] maxSlidingWindow(int[] nums, int k) {
            Deque<Integer> deque = new LinkedList<>();
            //Add k-1 elements to deque first
            for (int i = 0; i < k - 1; i++) {
                while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                    deque.pollLast();
                }
                deque.offerLast(i);
            }

            int[] result = new int[nums.length - k + 1];
            for (int i = 0; i < result.length; i++) {
                int nextIndex = k + i - 1;
                while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[nextIndex]) {
                    deque.pollLast();
                }
                deque.offerLast(nextIndex);
                while (deque.peekFirst() < i) {
                    deque.pollFirst();
                }
                result[i] = nums[deque.peekFirst()];
            }

            return result;
        }
    }
}
