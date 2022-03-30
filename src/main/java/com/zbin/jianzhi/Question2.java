package com.zbin.jianzhi;

import java.util.Stack;

/**
 * @author Zbin
 * @date 2021/11/10
 * <p>
 * 给定一个单链表的头结点pHead，长度为n，反转该链表后，返回新链表的表头。
 * <p>
 * 数据范围： n≤1000
 * 要求：空间复杂度 O(1) ，时间复杂度 O(n) 。
 * <p>
 * 如当输入链表{1,2,3}时，
 * 经反转后，原链表变为{3,2,1}，所以对应的输出为{3,2,1}。
 */
public class Question2 {
    public static ListNode ReverseList1(ListNode head) {
        if (head == null) {
            return null;
        }
        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        ListNode listNode = new ListNode(stack.pop().val);
        ListNode newHead = listNode;
        while (!stack.empty()) {
            listNode.next = new ListNode(stack.pop().val);
            listNode = listNode.next;
        }
        return newHead;
    }

    public static ListNode ReverseList2(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode newNode = null;
        ListNode next;
        while (head != null) {
            next = head.next;
            head.next = newNode;
            newNode = head;
            head = next;
        }
        return newNode;
    }
}
