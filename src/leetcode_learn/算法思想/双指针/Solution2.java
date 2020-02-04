package leetcode_learn.算法思想.双指针;


/**
 * 给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c。
 */

public class Solution2 {
    public boolean judgeSquareSum(int c) {
        int i = 0, j = (int)Math.sqrt(c);
        while (i <= j){
            int tmp = i*i + j*j;
            if (tmp == c)
                return true;
            else if (tmp < c){
                i++;
            }else {
                j--;
            }
        }
        return false;
    }
}
