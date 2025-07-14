package com.test.leetCode.suanfa.zhongdeng;

import java.util.Objects;

/**
 * @author leetcode
 * @since 2025/7/14
 * 两数相加
 **/
public class day2 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode listNode = addTwoNumbers(l1, l2);
        System.out.println(listNode);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (Objects.isNull(l1) || Objects.isNull(l2)) {
            return new ListNode(0);
        }
        if (l1.next == null && l2.next == null) {
            return new ListNode(l1.val + l2.val);
        } else {
            return new ListNode((l1.val * 10 + addTwoNumbers(l1.next, l2.next).val) + ((l2.val * 10 + addTwoNumbers(l1.next, l2.next).val)));
//            return addTwoNumbers(l1.next, l2.next);
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}


