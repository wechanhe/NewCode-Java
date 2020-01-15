package algo;

/**
 *  一个链表中包含环，请找出该链表的环的入口结点。要求不能使用额外的空间。
 *  解法：双指针——fast指针每次走两步，slow指针每次走一步，直到二者相遇；
 *  然后fast指针从头开始走，每次走一步，二者再次相遇的结点就是环的入口。
 */
public class Solution24 {
    public ListNode EntryNodeOfLoop(ListNode pHead){
        if(pHead == null || pHead.next == null)
            return null;
        ListNode slow = pHead, fast = pHead;
        do{
            fast = fast.next.next;
            slow = slow.next;
        }while (slow != fast);
        fast = pHead;
        while (slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
