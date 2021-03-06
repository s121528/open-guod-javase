package datastructure.ch02_linked.leetcode;

/**
 * @author guodd
 * @version 1.0
 */
public class Solution01 {
    public ListNode removeElements(ListNode head, int val) {
        // 01如果head值就是val,且不是空进行删除操作，如果删除后新的节点值也是val，所以需要循环
        while (head != null && head.val == val) {
            ListNode delNode = head;
            head = head.next;
            delNode.next = null;
        }
        // 02如果经过01步骤元素全部删除了，直接返回
        if (head == null) {
            return null;
        }
        // 03进行不是头节点的删除
        ListNode prev = head;
        while (prev.next != null) {
            if (prev.next.val == val) {
                // 要删除的元素
                ListNode delNode = prev.next;
                // 绕开要删除的元素
                prev.next = delNode.next;
                // 断掉联系
                delNode.next = null;
            } else {
                prev = prev.next;
            }
        }
        return head;
    }
}
