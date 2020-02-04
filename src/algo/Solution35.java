package algo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *  从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 */
public class Solution35 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        while (!queue.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            int cnt = queue.size();
            while (cnt-- > 0) {
                TreeNode node = queue.poll();
                if (node == null) continue;
                list.add(node.val);
                queue.add(node.left);
                queue.add(node.right);
                if (list.size() != 0) ret.add(list);
            }
            return ret;
        }
        return null;
    }
}
