package algo;

/**
 *  合并两个排序的链表
 *
 *  解法：建一个头结点，分别比较两个链表的首结点，将小的接入到新链表后。注意两个
 *  链表长度可能不一样，最后要将长的拼接到新链表后。
 */
public class Solution26 {
    public ListNode Merge(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        if (list1 != null)
            cur.next = list1;
        if (list2 != null)
            cur.next = list2;
        return head.next;
    }
}
