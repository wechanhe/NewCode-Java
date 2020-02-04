package leetcode.树;

/**
 * 求给定二叉树的最小深度。最小深度是指树的根结点到最近叶子结点的最短路径上结点的数量。
 */

public class Solution1 {
    public int run(TreeNode root) {
        if(root == null)
            return 0;
        else if(root.left == null)
            return 1 + run(root.right);
        else if(root.right == null)
            return 1 + run(root.left);
        else
            return 1 + Math.min(run(root.left), run(root.right));
    }
}