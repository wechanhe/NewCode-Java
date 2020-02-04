package leetcode.树;

import java.util.ArrayList;

/**
 *  给定一个二叉树和一个值sum，请找出所有的根节点到叶子节点的节点值之和等于sum的路径
 **/

public class Solution7 {

    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        paths(root, sum, list);
        return res;
    }
    private void paths(TreeNode root, int sum, ArrayList<Integer> list){
        if(root == null)
            return;
        if(root.left == null && root.right == null && sum - root.val == 0){
            list.add(root.val);
            res.add(new ArrayList<Integer>(list));
            list.remove(list.size() - 1);
            return;
        }
        list.add(root.val);
        paths(root.left, sum - root.val, list);
        paths(root.right, sum - root.val, list);
        list.remove(list.size() - 1);
    }

}
