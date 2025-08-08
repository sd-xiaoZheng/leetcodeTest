package com.test.leetCode.suanfa.jiandan;

import java.util.Arrays;
import java.util.List;

/**
 * 最长公共前缀
 */
public class day4 {
    public static void main(String[] args) {
//        String[] strs= {"abckji","abcdfer","abciop","abcdfgh","abcdsa","abcdewqop","abcdfrte","abcdnmk","abcdploi","abcdplokiju"};
        String[] strs = {"a", "ab"};
        System.out.println(longestCommonPrefix(strs));
    }

    /**
     * 妈的 理解错题了，我取出了最长的相同前缀
     * @param strs
     * @return
     */
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int length = strs.length;
        if (length == 1) {
            return strs[0];
        }
        int index = 0;
        String prefix = "";
        for (int i = 0, j = 1; j < length; i++, j++) {
            char[] charArray1 = strs[i].toCharArray();
            char[] charArray2 = strs[j].toCharArray();
            int length1 = charArray1.length;
            int length2 = charArray2.length;
            int o = 0;
            for (int i1 = 0; i1 < length1 && i1 < length2; i1++) {
                if (charArray1[i1] == charArray2[i1]) {
                    o++;
                    if (i1 == length1-1 || i1 == length2-1) {
                        prefix = strs[i].substring(0, o);
                    }
                } else {
                    if (index < o) {
                        index = o;
                        prefix = strs[i].substring(0, o);
                    }
                    break;
                }
            }
        }
        return prefix;
    }
}
