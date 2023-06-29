package com.aorez.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 剑指Offer58I翻转单词顺序 {
    class Solution {
        public String reverseWords(String s) {
            s = s.trim();
            String[] split = s.split("\\s+");
            List<String> words = Arrays.asList(split);
            Collections.reverse(words);
            return String.join(" ", words);
        }
    }
}
