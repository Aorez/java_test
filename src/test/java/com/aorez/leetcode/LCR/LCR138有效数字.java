package com.aorez.leetcode.LCR;

/*
https://leetcode.cn/problems/biao-shi-shu-zhi-de-zi-fu-chuan-lcof/description/?envType=study-plan-v2&envId=coding-interviews
中等

有效数字（按顺序）可以分成以下几个部分：
1. 若干空格
2. 一个 小数 或者 整数
3. （可选）一个 'e' 或 'E' ，后面跟着一个 整数
4. 若干空格

小数（按顺序）可以分成以下几个部分：
1. （可选）一个符号字符（'+' 或 '-'）
2. 下述格式之一：
- 至少一位数字，后面跟着一个点 '.'
- 至少一位数字，后面跟着一个点 '.' ，后面再跟着至少一位数字
- 一个点 '.' ，后面跟着至少一位数字

整数（按顺序）可以分成以下几个部分：
1. （可选）一个符号字符（'+' 或 '-'）
2. 至少一位数字

部分有效数字列举如下：["2", "0089", "-0.1", "+3.14", "4.", "-.9", "2e10", "-90E3", "3e+7", "+6e-1", "53.5e93", "-123.456e789"]
部分无效数字列举如下：["abc", "1a", "1e", "e3", "99e2.5", "--6", "-+3", "95a54e53"]
给你一个字符串 s ，如果 s 是一个 有效数字 ，请返回 true 。

示例 1：
输入：s = "0"
输出：true

示例 2：
输入：s = "e"
输出：false

示例 3：
输入：s = "."
输出：false

提示：
1 <= s.length <= 20
s 仅含英文字母（大写和小写），数字（0-9），加号 '+' ，减号 '-' ，空格 ' ' 或者点 '.' 。
 */
public class LCR138有效数字 {
    //解法，正则表达式，确定有限状态自动机
    class Solution {
        public boolean validNumber(String s) {
            return true;
        }
    }
}
