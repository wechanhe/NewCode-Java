package algo;

/**
 *  链表中倒数第 K 个结点
 *  解法：双指针——设链表的长度为 N。设置两个指针 P1 和 P2，
 *  先让 P1 移动 K 个节点，则还有 N - K 个节点可以移动。
 *  此时让 P1 和 P2 同时移动，可以知道当 P1 移动到链表结尾时，
 *  P2 移动到第 N - K 个节点处，该位置就是倒数第 K 个节点。
 */
public class Solution23 {
    public ListNode FindeKthToTail(ListNode head, int k){
        return null;
    }
}
