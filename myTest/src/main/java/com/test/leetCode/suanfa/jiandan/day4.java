package com.test.leetCode.suanfa.jiandan;

import java.util.Arrays;
import java.util.List;

/**
 * 最长公共前缀
 */
public class day4 {
    public static void main(String[] args) {
        String[] strs = {"abckji", "abcdfer", "abciop", "abcdfgh", "abcdsa", "abcdewqop", "abcdfrte", "abcdnmk", "abcdploi", "abcdplokiju"};
//        String[] strs = {"a", "ab"};
//        String[] strs = {"ab", "a"};
//        String[] strs = {"a"};
//        String[] strs = {""};
        System.out.println(longestCommonPrefix(strs));
    }

    /**
     * 排名45%
     * 公共最长前缀
     *
     * @param strs
     * @return
     */
    public static String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        String temp = "";
        for (int j = 0; j < 200; j++) {
            for (int i = 0; i < len; i++) {
                int length = strs[i].length();
                if (j == length) {
                    return temp.substring(0,length);
                }
                if (temp == null) {
                    temp = strs[i].substring(0, j + 1);
                } else {
                    if (temp.equals(strs[i].substring(0, j + 1))||i==0) {
                        temp = strs[i].substring(0, j + 1);
                    }else {
                        return temp.substring(0, temp.length()-1);
                    }
                }
            }
        }
        return temp;
    }



//第一
    public static String longestCommonPrefixOne(String[] strs) {
        int n = strs.length;
        if(n==1) return strs[0];
        int ans = 0;
        for(int i=0;i<strs[0].length();i++){
            if(find(strs,i)){
                ++ans;
            }else{
                return strs[0].substring(0,ans);
            }
        }
        return strs[0].substring(0,ans);
    }
    public static boolean find(String[] strs,int cnt){
        int n = strs.length;
        char tmp = strs[0].charAt(cnt);
        for(int i=1;i<n;i++){
            if(strs[i].length()<=cnt||strs[i].charAt(cnt)!=tmp){
                return false;
            }
        }
        return true;
    }


    /**
     * 妈的 理解错题了，我取出了最长的相同前缀
     *
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
                    if (i1 == length1 - 1 || i1 == length2 - 1) {
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
