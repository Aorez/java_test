package com.aorez.leetcode.LCR;

/*
https://leetcode.cn/problems/ti-huan-kong-ge-lcof/description/?envType=study-plan-v2&envId=coding-interviews
简单

假定一段路径记作字符串 path，其中以 "." 作为分隔符。现需将路径加密，加密方法为将 path 中的分隔符替换为空格 " "，请返回加密后的字符串。

示例 1：
输入：path = "a.aef.qerf.bb"
输出："a aef qerf bb"

限制：
0 <= path.length <= 10000
 */
public class LCR122路径加密 {
    class Solution {
        public String pathEncryption(String path) {
            return path.replaceAll("\\.", " ");
        }
    }
}
