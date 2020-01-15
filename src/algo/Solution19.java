package algo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *  在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
 *  例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 */
public class Solution19 {
    public ListNode deleteDuplication(ListNode pHead){
        if(pHead == null || pHead.next == null)
            return pHead;
        ListNode next = pHead.next;
        if(pHead.val == next.val){
            while (next != null && pHead.val == next.val)
                next = next.next;
            return deleteDuplication(next);
        }else {
            pHead.next = deleteDuplication(pHead.next);
            return pHead;
        }
    }
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        for(Iterator i = set.iterator();i.hasNext();)
            System.out.println(i.next());
        for(Integer item:set){
            System.out.println(item);
        }
    }
}
