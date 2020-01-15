package algo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 */
public class Solution33 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> ret = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int cnt = queue.size();
            while(cnt-- > 0){
                TreeNode node = queue.poll();
                if(node == null)continue;
                ret.add(node.val);
                queue.add(node.left);
                queue.add(node.right);
            }
        }
        return ret;
    }
}
