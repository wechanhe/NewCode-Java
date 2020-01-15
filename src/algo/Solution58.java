package algo;

/**
 *  二叉树的深度
 */
public class Solution58 {
    public int TreeDepth(TreeNode root) {
        if(root == null)
            return 0;
        return 1 + Math.max(TreeDepth(root.left), TreeDepth(root.right));
    }
}
