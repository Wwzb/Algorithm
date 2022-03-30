package com.zbin.jianzhi;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Zbin
 * @date 2021/11/11
 * <p>
 * 给一个长度为n链表，若其中包含环，请找出该链表的环的入口结点，否则，返回null。
 * <p>
 * 数据范围： 0n≤10000
 * 节点值范围：[1,10000]
 * 要求：空间复杂度 O(1)，时间复杂度 O(n)
 */
public class Question5 {

    // 辅助set
    public static ListNode EntryNodeOfLoop1(ListNode pHead) {
        Set<ListNode> set = new HashSet<>();
        while (pHead != null) {
            if (set.contains(pHead)) {
                return pHead;
            }
            set.add(pHead);
            pHead = pHead.next;
        }
        return null;
    }

    // 快慢指针
    public static ListNode EntryNodeOfLoop2(ListNode pHead) {
        if (pHead == null) {
            return null;
        }
        ListNode fast = pHead;
        ListNode slow = pHead;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return null;
        }
        fast = pHead;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}
