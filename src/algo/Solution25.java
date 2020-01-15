package algo;

/**
 *  反转链表
 *  解法：头插法，递归
 */
public class Solution25 {
    public ListNode ReverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode p = null, pre_p = null;
        while(head != null){
            p = head;
            head = head.next;
            p.next = pre_p;
            pre_p = p;
        }
        return pre_p;
    }
}
