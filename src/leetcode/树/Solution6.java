package leetcode.树;

/**
 *  填充所有节点的next指针，指向它右兄弟节点。如果没有右兄弟节点，则应该将next指针设置为null。
 *  初始时，所有的next指针都为null
 **/

public class Solution6 {

    public void connect(TreeNode root) {
        if (root == null)
            return;
        if (root.left!=null && root.right!=null)
            root.left.next = root.right;
        if (root.next != null &&root.right!=null){
            root.right.next = root.next.left;
        }
        connect(root.left);
        connect(root.right);
    }

}
