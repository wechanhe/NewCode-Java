package algo;

import java.util.Arrays;

/**
 * 一只青蛙一次可以跳上 1 级台阶，也可以跳上 2 级... 它也可以跳上 n 级。
 * 求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 *
 * 解法：动态规划
 */
public class Solution10 {
    public int JumpFloorII(int target){
        int[] dp = new int[target];
        Arrays.fill(dp, 1);
        for(int i=1;i<target;i++){
            for (int j=0;j<i;j++)
                dp[i] += dp[j];
        }
        return dp[target-1];
    }
}
