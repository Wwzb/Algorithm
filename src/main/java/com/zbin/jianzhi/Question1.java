package com.zbin.jianzhi;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author Zbin
 * @date 2021/11/10
 * <p>
 * 输入一个链表的头节点，按链表从尾到头的顺序返回每个节点的值（用数组返回）。
 * <p>
 * 示例1
 * 输入：
 * {1,2,3}
 * 返回值：
 * [3,2,1]
 * <p>
 * 示例2
 * 输入：
 * {67,0,24,58}
 * 返回值：
 * [58,24,0,67]
 */
public class Question1 {

    // 数组
    public static ArrayList<Integer> printListFromTailToHead1(ListNode listNode) {
        if (listNode == null) {
            return new ArrayList<>();
        }
        int[] arr = new int[10000];
        int i = 0;
        while (listNode != null) {
            arr[i] = listNode.val;
            listNode = listNode.next;
            i++;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int j = i - 1; j >= 0; j--) {
            list.add(arr[j]);
        }
        return list;
    }

    // 栈
    public static ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
        if (listNode == null) {
            return new ArrayList<>();
        }
        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> list = new ArrayList<>();
        while (!stack.empty()) {
            list.add(stack.pop());
        }
        return list;
    }

    public static ArrayList<Integer> printListFromTailToHead3(ListNode listNode) {
        if (listNode == null) {
            return new ArrayList<>();
        }
        ArrayList<Integer> list = new ArrayList<>();
        while (listNode != null) {
            list.add(0, listNode.val);
            listNode = listNode.next;
        }
        return list;
    }
}
