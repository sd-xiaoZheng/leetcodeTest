package com.test.leetCode.suanfa.jiandan;

import com.drew.lang.StringUtil;

/**
 * @author leetcode
 * @since 2025/7/22
 *  回文数
 **/
public class day2 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(15251));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        String s = x + "";
        String string = new StringBuilder(s).reverse().toString();
        if (s.equals(string)) {
            return true;
        }
        return false;
    }
}
