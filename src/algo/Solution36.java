package algo;

/**
 *  二叉搜索树的后序遍历序列:输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 *
 *  思路：二叉排序树后续遍历序列中，最后一个节点就是根节点，根节点比左子树大比右子树小，
 *  需要验证上面两点，然后递归验证左右子树。
 */
public class Solution36 {
    public boolean VerifySequenceOfBST(int[] sequence){
        if(sequence == null || sequence.length == 0)
            return false;
        return verify(sequence, 0, sequence.length-1);
    }
    private boolean verify(int[] sequence, int first, int last){
        if(last-first <= 1)
            return true;
        int rootVal = sequence[last];
        int cutIndex = first;
        while (cutIndex < last && sequence[cutIndex] <= rootVal)
            cutIndex++;
        for(int i=cutIndex;i<last;i++){
            if(sequence[i] < rootVal)
                return false;
        }
        // 验证子树
        return verify(sequence, first, cutIndex-1) && verify(sequence, cutIndex, last-1);
    }
}
