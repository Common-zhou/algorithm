package com.geetest.algorithm;
//写代码 一定要理清自己的思路  知道什么时候中止

public class Leetcode_206 {

}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution_206 {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            //如果为空 或者长度为1  直接返回
            return head;
        }
        ListNode cur = head;
        ListNode next = head.next;
        cur.next = null;
        while (next != null){
            ListNode tmp = next.next;       //存储下一个
            next.next = cur;
            cur = next;
            next = tmp;
        }
        return cur;
    }
}
