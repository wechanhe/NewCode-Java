package leetcode.树;

/** 求根结点到叶子节点所有路径之和：
 * 给定一个仅包含数字0-9的二叉树，每一条从根节点到叶子节点的路径都可以用一个数字表示。
 * 例如根节点到叶子节点的一条路径是1->2->3,那么这条路径就用123来代替。
 * 找出根节点到叶子节点的所有路径表示的数字之和
 **/

public class Solution4 {

    public int sumNumbers(TreeNode root) {
        int sum = 0;
        if (root == null) {
            return sum;
        }
        return preorderSumNumbers(root, sum);
    }
    public int preorderSumNumbers(TreeNode root, int sum) {
        if (root == null)
            return 0;
        sum = sum * 10 + root.val;
        if (root.left == null && root.right == null) {
            return sum;
        }
        return preorderSumNumbers(root.left, sum) + preorderSumNumbers(root.right, sum);
    }

}
