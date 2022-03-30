package com.zbin.jianzhi;

import org.junit.Test;

/**
 * @author Zbin
 * @date 2021/11/10
 */
public class Question4Test {

    @Test
    public void test1() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        ListNode node3 = new ListNode(3);
        node2.next = node3;
        ListNode node6 = new ListNode(6);
        node3.next = node6;
        ListNode node7 = new ListNode(7);
        node6.next = node7;

        ListNode nodeA = new ListNode(4);
        ListNode nodeB = new ListNode(5);
        nodeA.next = nodeB;
        nodeB.next = node6;
        node6.next = node7;
        ListNode listNode = Question4.FindFirstCommonNode1(node1, nodeA);
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
        ListNode node6 = new ListNode(6);
        node3.next = node6;
        ListNode node7 = new ListNode(7);
        node6.next = node7;

        ListNode nodeA = new ListNode(4);
        ListNode nodeB = new ListNode(5);
        nodeA.next = nodeB;
        nodeB.next = node6;
        node6.next = node7;
        ListNode listNode = Question4.FindFirstCommonNode2(node1, nodeA);
        while (listNode != null) {
            System.out.println(listNode);
            listNode = listNode.next;
        }
    }
}
