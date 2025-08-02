package com.test.leetCode.suanfa.jiandan;

import java.util.Map;

/**
 * 罗马数字转整数
 */
public class day3 {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }


    /**
     * 第一版 有点垃圾 下次直接纯算
     */
    public  static  final Map<String, Integer> map = Map.ofEntries(
            Map.entry("I", 1),
            Map.entry("V", 5),
            Map.entry("X", 10),
            Map.entry("L", 50),
            Map.entry("C", 100),
            Map.entry("D", 500),
            Map.entry("M", 1000),
            Map.entry("IV", 4),
            Map.entry("IX", 9),
            Map.entry("XL", 40),
            Map.entry("XC", 90),
            Map.entry("CD", 400),
            Map.entry("CM", 900)
    );
    public static int romanToInt(String s) {
        char[] charArray = s.toCharArray();
        int len = charArray.length;
        StringBuilder sb = new StringBuilder();
        Integer res = 0;
        for (int i = len-1; i > -1; i--) {
            sb.setLength(0);
            if (i - 1 > -1) {
                sb.append(charArray[i - 1]);
            }
            sb.append(charArray[i]);
            if (map.containsKey(sb.toString())) {
                res += map.get(sb.toString());
                i--;
            } else {
                sb.setLength(0);
                sb.append(charArray[i]);
                res += map.getOrDefault(sb.toString(), 0);
            }
        }
        return res;
    }
}
