package algo;

/**
 *  在 O(1) 时间内删除链表节点
 */
public class Solution18 {
    public ListNode deleteNode(ListNode head, ListNode tobeDelete){
        if(head == null || tobeDelete == null)
            return null;
        if(tobeDelete.next != null){
            ListNode next = tobeDelete.next;
            tobeDelete.val = next.val;
            tobeDelete.next = next.next;
        }else {
            if(head == tobeDelete)
                head = null;
            else {
                ListNode cur = head;
                while (cur.next != tobeDelete)
                    cur = cur.next;
                cur.next = null;
            }
        }
        return null;
    }
}
