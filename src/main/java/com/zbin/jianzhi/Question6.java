package com.zbin.jianzhi;

/**
 * @author Zbin
 * @date 2021/11/11
 * <p>
 * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。返回删除后的链表的头节点。
 * <p>
 * 1.此题对比原题有改动
 * 2.题目保证链表中节点的值互不相同
 * 3.该题只会输出返回的链表和结果做对比，所以若使用 C 或 C++ 语言，你不需要 free 或 delete 被删除的节点
 * <p>
 * 数据范围:
 * 0<=链表节点值<=10000
 * 0<=链表长度<=10000
 * <p>
 * 示例1
 * 输入：
 * {2,5,1,9},5
 * 返回值：
 * {2,1,9}
 * 说明：
 * 给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 2 -> 1 -> 9
 * <p>
 * 示例2
 * 输入：
 * {2,5,1,9},1
 * 返回值：
 * {2,5,9}
 * 说明：
 * 给定你链表中值为 1 的第三个节点，那么在调用了你的函数之后，该链表应变为 2 -> 5 -> 9
 */
public class Question6 {

    public static ListNode deleteNode(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        if (head.val == val) {
            head = head.next;
            return head;
        }
        ListNode cur = head;
        while (cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
                break;
            }
            cur = cur.next;
        }
        return head;
    }
}
