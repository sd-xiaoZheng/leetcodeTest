package com.test.leetCode.suanfa.jiandan;

import com.drew.lang.StringUtil;

/**
 * @author leetcode
 * @since 2025/7/22
 *  回文数
 **/
public class day2 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(2147483647));
    }

    /**
     * 第一版解出来的，用的string 内存占用还行，运行速度低
     * @param x
     * @return
     */
    public static boolean isPalindromeStr(int x) {
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


    /**
     * 这一版用纯数字
     * @param x
     * @return
     */
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x!= 0 && x % 10 == 0)) {
            return false;
        }

        int temp = 0;
        int flag = x;
        while (flag>temp && temp>=0) {
            temp = temp * 10 + x % 10;
            x/=10;
        }
        if (flag == temp) {
            return true;
        }
        return false;
    }
}



























