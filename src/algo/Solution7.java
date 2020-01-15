package algo;

/**
 *  求斐波那契数列的第 n 项，n <= 39。
 */
public class Solution7 {
    // 递归
    public int Fibonacci1(int n){
        if(n <= 1)
            return n;
        int[] fib = new int[n+1];
        fib[1] = 1;
        for(int i=2;i<=n;i++)
            fib[i] = fib[i-1] + fib[i-2];
        return fib[n];
    }
    // 节省空间
    public int Fibonacci2(int n){
        if(n <= 1)
            return n;
        int pre2 = 0, pre1 = 1;
        int fib = 0;
        for(int i=2;i<=n;i++){
            fib = pre2 + pre1;
            pre2 = pre1;
            pre1 = fib;
        }
        return fib;
    }
}
