package com.zbin.jianzhi;

/**
 * @author Zbin
 * @date 2021/11/11
 * <p>
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针random指向一个随机节点）
 * 请对此链表进行深拷贝，并返回拷贝后的头结点。
 * <p>
 * 输入:{1,2,3,4,5,3,5,#,2,#}
 * 输出:{1,2,3,4,5,3,5,#,2,#}
 * 解析:我们将链表分为两段，前半部分{1,2,3,4,5}为ListNode，后半部分{3,5,#,2,#}是随机指针域表示。
 * 以上示例前半部分可以表示链表为的ListNode:1->2->3->4->5
 * 后半部分，3，5，#，2，#分别的表示为
 * 1的位置指向3，2的位置指向5，3的位置指向null，4的位置指向2，5的位置指向null
 */
public class Question8 {

    // 栈
    public static RandomListNode Clone(RandomListNode pHead) {
        return null;
    }
}
