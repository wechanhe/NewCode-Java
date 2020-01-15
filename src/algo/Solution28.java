package algo;

/**
 *  二叉树的镜像：交换每个二叉树的左右子树
 */
public class Solution28 {
    public void Mirror(TreeNode root) {
        if(root == null)
            return;
        TreeNode t = root.left;
        root.left = root.right;
        root.right = t;
        Mirror(root.left);
        Mirror(root.right);
    }
}
