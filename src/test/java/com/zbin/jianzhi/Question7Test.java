package com.zbin.jianzhi;

import org.junit.Test;

/**
 * @author Zbin
 * @date 2021/11/10
 */
public class Question7Test {

    @Test
    public void test1() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        ListNode node3 = new ListNode(3);
        node2.next = node3;
        ListNode node4 = new ListNode(4);
        node3.next = node4;
        ListNode node5 = new ListNode(5);
        node4.next = node5;
        ListNode listNode = Question7.FindKthToTail1(node1, 6);
        while (listNode != null) {
            System.out.println(listNode);
            listNode = listNode.next;
        }
    }

    @Test
    public void test2() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        ListNode node3 = new ListNode(3);
        node2.next = node3;
        ListNode node4 = new ListNode(4);
        node3.next = node4;
        ListNode node5 = new ListNode(5);
        node4.next = node5;
        ListNode listNode = Question7.FindKthToTail2(node1, 4);
        while (listNode != null) {
            System.out.println(listNode);
            listNode = listNode.next;
        }
    }
}
