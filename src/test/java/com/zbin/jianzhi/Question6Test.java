package com.zbin.jianzhi;

import org.junit.Test;

/**
 * @author Zbin
 * @date 2021/11/10
 */
public class Question6Test {

    @Test
    public void test1() {
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(0);
        node1.next = node2;
        ListNode node3 = new ListNode(3);
        node2.next = node3;
        ListNode node4 = new ListNode(1);
        node3.next = node4;
        ListNode listNode = Question6.deleteNode(node1, 2);
        while (listNode != null) {
            System.out.println(listNode);
            listNode = listNode.next;
        }
    }

}
