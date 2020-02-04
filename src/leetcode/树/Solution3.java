package leetcode.树;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 求给定的二叉树的前序遍历。
 */

public class Solution3 {

    ArrayList<Integer> list = new ArrayList<Integer>();
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        if(root == null)
            return list;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            list.add(temp.val);
            if(temp.right != null)
                stack.push(temp.right);
            if(temp.left != null)
                stack.push(temp.left);
        }
        return list;
    }
}
