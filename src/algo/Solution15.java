package algo;

/**
 *  某个数，其二进制中1的个数
 *
 *  解法：n&(n-1)，该位运算去掉 n 的二进制级表示中最低的那一位。
 *      Integer.bitCount()
 */
public class Solution15 {
    public int NumberOf1(int n){
        int cnt = 0;
        while(n != 0){
            cnt++;
            n &= n-1;
        }
        return cnt;
    }
}
