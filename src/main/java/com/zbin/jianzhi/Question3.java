package com.zbin.jianzhi;

/**
 * @author Zbin
 * @date 2021/11/10
 * <p>
 * 输入两个递增的链表，单个链表的长度为n，合并这两个链表并使新链表中的节点仍然是递增排序的。
 * 数据范围：0≤n≤1000， −1000≤节点值≤1000
 * 要求：空间复杂度 O(1)，时间复杂度 O(n)
 * <p>
 * 如输入{1,3,5},{2,4,6}时，合并后的链表为{1,2,3,4,5,6}，所以对应的输出为{1,2,3,4,5,6}
 */
public class Question3 {

    // 非递归
    public static ListNode Merge1(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode listNode = null;
        ListNode cur = null;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                if (listNode == null) {
                    listNode = new ListNode(list1.val);
                    cur = listNode;
                } else {
                    cur.next = new ListNode(list1.val);
                    cur = cur.next;
                }
                list1 = list1.next;
            } else {
                if (listNode == null) {
                    listNode = new ListNode(list2.val);
                    cur = listNode;
                } else {
                    cur.next = new ListNode(list2.val);
                    cur = cur.next;
                }
                list2 = list2.next;
            }
        }
        if (list1 != null) {
            cur.next = list1;
        }
        if (list2 != null) {
            cur.next = list2;
        }
        return listNode;
    }

    // 非递归优化
    public static ListNode Merge2(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode listNode = null;
        ListNode cur = null;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                if (listNode == null) {
                    cur = listNode = list1;
                } else {
                    cur.next = list1;
                    cur = cur.next;
                }
                list1 = list1.next;
            } else {
                if (listNode == null) {
                    cur = listNode = list2;
                } else {
                    cur.next = list2;
                    cur = cur.next;
                }
                list2 = list2.next;
            }
        }
        if (list1 != null) {
            cur.next = list1;
        }
        if (list2 != null) {
            cur.next = list2;
        }
        return listNode;
    }

    // 递归
    public static ListNode Merge3(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1.val <= list2.val) {
            list1.next = Merge2(list1.next, list2);
            return list1;
        } else {
            list2.next = Merge2(list1, list2.next);
            return list2;
        }
    }
}
