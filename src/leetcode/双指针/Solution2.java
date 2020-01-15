package leetcode.双指针;

import java.util.Stack;

/**
 *  两数平方和
 */
public class Solution2 {
    public boolean judgeSquareSum(int c) {
        if(c <= 0)return false;
        int l = 1, h = (int)Math.sqrt(c);
        while(l<h){
            int sum = l*l + h*h;
            if(sum == c)return true;
            else if(sum > c)h--;
            else l++;
        }
        return false;
    }
}
