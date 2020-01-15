package algo;

/**
 *  剪绳子：把一根绳子剪成多段，并且使得每一段的长度乘积最大
 *  解法：动态规划 or 贪心算法
 */
public class Solution14 {
    // 动态规划
    public int integerBreak(int n){
        int[] dp = new int[n+1];
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            for (int j=1;j<i;j++)
                dp[i] = Math.max(dp[i],Math.max(j*(i-j),dp[j]*(i-j)));
        }
        return dp[n];
    }
}
