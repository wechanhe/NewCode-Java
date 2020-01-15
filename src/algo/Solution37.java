package algo;

import java.util.ArrayList;

/**
 *  二叉树中和为某一值的路径
 *
 *  解法：结果数组声明为类成员，递归查找，将符合的路径加入到结果数组。
 */
public class Solution37 {
    private ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        backtracking(root, target, new ArrayList<>());
        return ret;
    }

    private void backtracking(TreeNode node, int target, ArrayList<Integer> path){
        if(node == null)
            return;
        path.add(node.val);
        target -= node.val;
        if(target == 0 && node.left == null && node.right == null){
            ret.add(new ArrayList<>(path));
        }else {
            backtracking(node.left, target, path);
            backtracking(node.right, target, path);
        }
        path.remove(path.size() - 1);
    }
}
