package algo;

/**
 *  输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 */
public class Solution59 {
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root == null)
            return true;
        return Math.abs(depthOfBinaryTree(root.left)-depthOfBinaryTree(root.right))<=1;
    }
    private int depthOfBinaryTree(TreeNode root){
        return (root == null)?0:1 + Math.max(depthOfBinaryTree(root.left), depthOfBinaryTree(root.right));
    }
}
