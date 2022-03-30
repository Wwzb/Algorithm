package com.zbin.jianzhi;

/**
 * @author Zbin
 * @date 2021/11/11
 * <p>
 * 输入两个无环的单向链表，找出它们的第一个公共结点，如果没有公共节点则返回空。（注意因为传入数据是链表，所以错误测试数据的提示是用其他方式显示的，保证传入数据是正确的）
 * <p>
 * 数据范围：n≤1000
 * 要求：空间复杂度 O(1)，时间复杂度 O(n)
 * <p>
 * 示例1
 * 输入：
 * {1,2,3},{4,5},{6,7}
 * 返回值：
 * {6,7}
 * 说明：
 * 第一个参数{1,2,3}代表是第一个链表非公共部分，第二个参数{4,5}代表是第二个链表非公共部分，最后的{6,7}表示的是2个链表的公共部分
 * 这3个参数最后在后台会组装成为2个两个无环的单链表，且是有公共节点的
 * <p>
 * 示例2
 * 输入：
 * {1},{2,3},{}
 * 返回值：
 * {}
 */
public class Question4 {

    // 双指针
    public static ListNode FindFirstCommonNode1(ListNode pHead1, ListNode pHead2) {
        ListNode p1 = pHead1, p2 = pHead2;
        while (p1 != p2) {
            p1 = (p1 == null ? pHead2 : p1.next);
            p2 = (p2 == null ? pHead1 : p2.next);
        }
        return p1;
    }

    // 移动到同样的起点
    public static ListNode FindFirstCommonNode2(ListNode pHead1, ListNode pHead2) {
        int l1 = getLength(pHead1);
        int l2 = getLength(pHead2);
        if (l1 < l2) {
            pHead2 = walk(pHead2, l2 - l1);
        } else {
            pHead1 = walk(pHead1, l1 - l2);
        }
        while (pHead1 != pHead2) {
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }
        return pHead1;
    }

    private static int getLength(ListNode listNode) {
        int l = 0;
        while (listNode != null) {
            listNode = listNode.next;
            l++;
        }
        return l;
    }

    private static ListNode walk(ListNode listNode, int step) {
        while (step > 0) {
            listNode = listNode.next;
            step--;
        }
        return listNode;
    }

}
