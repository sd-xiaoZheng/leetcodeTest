package com.test.leetCode.suanfa.jiandan;

import java.util.Arrays;
import java.util.List;

/**
 * 最长公共前缀
 */
public class day4 {
    public static void main(String[] args) {
        String[] strs= {"abckji","abcdfer","abciop","abcdfgh","abcdsa","abcdewqop","abcdfrte","abcdnmk","abcdploi","abcdplokiju"};
//        String[] strs = {"a", "ab"};
//        String[] strs = {"a"};
        System.out.println(longestCommonPrefix(strs));
    }

    /**
     * 公共最长前缀
     * @param strs
     * @return
     */
    public static String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        String temp=null;
        for (int j = 0; j <200; j++) {
            for (int i = 0; i < len; i++) {
                if (j==strs[i].length()){
                    return temp;
                }

                if (temp==null){
                    temp=strs[i].substring(0, j+1);
                }else {
                    if (temp.equals(strs[i].substring(0,j+1))){
                        if (i==len-1){
                            temp=strs[i].substring(0,j+1);
                            return temp;
                        }
                        temp=strs[i].substring(0, j+1);
                    }else {
                        return temp;
                    }
                }
            }
            temp=strs[1].substring(0,j+1);
        }
        return temp;
    }












    /**
     * 妈的 理解错题了，我取出了最长的相同前缀
     * @param strs
     * @return
     */
    public static String longestCommonPrefix1(String[] strs) {
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
