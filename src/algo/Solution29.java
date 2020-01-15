package algo;

/**
 *  对称的二叉树：首先根节点以及其左右子树，左子树的左子树和右子树的右子树相同
 *   左子树的右子树和右子树的左子树相同即可，
 *   采用递归非递归也可，采用栈或队列存取各级子树根节点
 */
public class Solution29 {
    public boolean isSymmetrical(TreeNode pRoot){
        if(pRoot == null)
            return true;
        return isSymmetrical(pRoot.left, pRoot.right);
    }

    private boolean isSymmetrical(TreeNode t1, TreeNode t2){
        if(t1 == null && t2 == null)
            return true;
        if(t1 == null || t2 == null)
            return false;
        if(t1.val != t2.val)
            return false;
        return isSymmetrical(t1.left, t2.right) && isSymmetrical(t1.right, t2.left);
    }
}
