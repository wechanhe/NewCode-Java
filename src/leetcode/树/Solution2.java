package leetcode.树;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 求给定的二叉树的后序遍历。
 */

public class Solution2 {
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null)
            return list;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;
        stack.push(root);
        while(!stack.isEmpty()){
            // 只看栈顶元素，不弹出
            TreeNode cur = stack.peek();
            if((cur.left == null && cur.right == null)
                    || (pre != null && (pre == cur.left || pre == cur.right))){
                list.add(cur.val);
                stack.pop();
                pre = cur;
            }
            else{
                if(cur.right != null)
                    stack.push(cur.right);
                if(cur.left != null)
                    stack.push(cur.left);
            }
        }
        return list;
    }

    // 递归解法
    public ArrayList<Integer> postorderTraversal2(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null)
            return list;
        list.addAll(postorderTraversal(root.left));
        list.addAll(postorderTraversal(root.right));
        list.add(root.val);
        return list;
    }
}
