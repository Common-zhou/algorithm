package com.geetest.algorithm;

public class Leetcode_24 {
    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        ListNode next = new ListNode(9);
        head.next = next;
        ListNode next1 = new ListNode(10);
        next.next = next1;
        next1.next = new ListNode(90);

        ListNode listNode = new Solution_24().swapPairs(head);
        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}


class Solution_24 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode pre = head;        //存储第一个节点
        ListNode cur = pre.next;    //存储第二个节点
        head = cur;
        ListNode prepre = null;

        while (pre != null && cur != null) {
            ListNode next = cur.next;       //临时存储下一个节点

            if (prepre != null){
                prepre.next = cur;
            }

            prepre = pre;

            cur.next = pre;
            pre.next = next;
            pre = next;
            if (next != null) {
                cur = next.next;
            }

        }
        return head;

    }
}