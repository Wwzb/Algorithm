package com.zbin.jianzhi;

import org.junit.Test;

/**
 * @author Zbin
 * @date 2021/11/10
 */
public class Question1Test {

    @Test
    public void test1() {
        ListNode node1 = new ListNode(67);
        ListNode node2 = new ListNode(0);
        node1.next = node2;
        ListNode node3 = new ListNode(24);
        node2.next = node3;
        node3.next = new ListNode(58);
        System.out.println(Question1.printListFromTailToHead1(node1));
    }

    @Test
    public void test2() {
        ListNode node1 = new ListNode(67);
        ListNode node2 = new ListNode(0);
        node1.next = node2;
        ListNode node3 = new ListNode(24);
        node2.next = node3;
        node3.next = new ListNode(58);
        System.out.println(Question1.printListFromTailToHead2(node1));
    }

    @Test
    public void test3() {
        ListNode node1 = new ListNode(67);
        ListNode node2 = new ListNode(0);
        node1.next = node2;
        ListNode node3 = new ListNode(24);
        node2.next = node3;
        node3.next = new ListNode(58);
        System.out.println(Question1.printListFromTailToHead3(node1));
    }
}
