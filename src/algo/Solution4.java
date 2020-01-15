package algo;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 从尾到头反过来打印出每个结点的值
 *
 */
class ListNode{
    int val;
    ListNode next;
    ListNode(int value){
        this.val = value;
        this.next = null;
    }
}

public class Solution4 {
    // 递归
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        ArrayList<Integer> ret = new ArrayList<>();
        if(listNode != null){
            ret.addAll(printListFromTailToHead(listNode.next));
            ret.add(listNode.val);
        }
        return ret;
    }

    // 头插法
    public ArrayList<Integer> printListFromTailToHead1(ListNode listNode){
        // 头插法构建逆序链表
        ListNode head = new ListNode(-1);
        while (listNode != null){
            ListNode memo = listNode.next;
            listNode.next = head.next;
            head.next = listNode;
            listNode = memo;
        }
        // 构建ArrayList
        ArrayList<Integer> ret = new ArrayList<>();
        head = head.next;
        while (head != null){
            ret.add(head.val);
            head = head.next;
        }
        return ret;
    }
    // 使用栈
    public ArrayList<Integer> printListFromTailToHead2(ListNode listNode){
        Stack<Integer> stack = new Stack<>();
        while (listNode != null){
            stack.add(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> ret = new ArrayList<>();
        while (!stack.empty()){
            ret.add(stack.pop());
        }
        return ret;
    }
}
