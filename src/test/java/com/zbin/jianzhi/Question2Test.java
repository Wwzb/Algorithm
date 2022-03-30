package com.zbin.jianzhi;

import org.junit.Test;

/**
 * @author Zbin
 * @date 2021/11/10
 */
public class Question2Test {

    @Test
    public void test1() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        node2.next = new ListNode(3);
        ListNode listNode = Question2.ReverseList1(node1);
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
        node2.next = new ListNode(3);
        ListNode listNode = Question2.ReverseList2(node1);
        while (listNode != null) {
            System.out.println(listNode);
            listNode = listNode.next;
        }
    }
}
