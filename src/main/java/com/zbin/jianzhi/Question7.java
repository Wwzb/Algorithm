package com.zbin.jianzhi;

import com.zbin.stack.Stack;

/**
 * @author Zbin
 * @date 2021/11/11
 * <p>
 * 输入一个长度为 n 的链表，设链表中的元素的值为 ai ，返回该链表中倒数第k个节点。
 * 如果该链表长度小于k，请返回一个长度为 0 的链表。
 * <p>
 * <p>
 * 要求：空间复杂度 O(n)，时间复杂度 O(n)
 * 进阶：空间复杂度 O(1)，时间复杂度 O(n)
 * <p>
 * 示例1
 * 输入：
 * {1,2,3,4,5},2
 * 返回值：
 * {4,5}
 * 说明：
 * 返回倒数第2个节点4，系统会打印后面所有的节点来比较。
 * <p>
 * 示例2
 * 输入：
 * {2},8
 * 返回值：
 * {}
 */
public class Question7 {

    // 栈
    public static ListNode FindKthToTail1(ListNode pHead, int k) {
        if (pHead == null) {
            return null;
        }
        Stack<ListNode> stack = new Stack<>();
        while (pHead != null) {
            stack.push(pHead);
            pHead = pHead.next;
        }
        ListNode listNode = null;
        for (int i = 0; i < k; i++) {
            if (stack.empty()) {
                return null;
            }
            listNode = stack.pop();
        }
        return listNode;
    }

    // 快慢指针
    public static ListNode FindKthToTail2(ListNode pHead, int k) {
        if (pHead == null || k <= 0) {
            return null;
        }
        ListNode fast = pHead;
        ListNode slow = pHead;
        while (fast != null && k > 0){
            fast = fast.next;
            k--;
        }
        if(k > 0){
            return null;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
