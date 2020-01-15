package algo;

/**
 * 一只青蛙一次可以跳上 1 级台阶，也可以跳上 2 级。
 * 求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 *
 * 解法：斐波那契数列
 */
public class Solution9 {
    public int JumpFloor(int n){
        if(n<=2)
            return n;
        int pre2 = 1, pre1 = 2;
        int result = 0;
        for(int i=2;i<n;i++){
            result = pre2 + pre1;
            pre2 = pre1;
            pre1 = result;
        }
        return result;
    }
}
