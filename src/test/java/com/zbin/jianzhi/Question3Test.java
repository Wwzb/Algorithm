package com.zbin.jianzhi;

import org.junit.Test;

/**
 * @author Zbin
 * @date 2021/11/10
 */
public class Question3Test {

    @Test
    public void test1() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        node1.next = node2;
        node2.next = new ListNode(5);

        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(4);
        node3.next = node4;
        node4.next = new ListNode(6);
        ListNode listNode = Question3.Merge1(node1, node3);
        while (listNode != null) {
            System.out.println(listNode);
            listNode = listNode.next;
        }
    }

    @Test
    public void test2() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        node1.next = node2;
        node2.next = new ListNode(5);

        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(4);
        node3.next = node4;
        node4.next = new ListNode(6);
        ListNode listNode = Question3.Merge2(node1, node3);
        while (listNode != null) {
            System.out.println(listNode);
            listNode = listNode.next;
        }
    }
}
