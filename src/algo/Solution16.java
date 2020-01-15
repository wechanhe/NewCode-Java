package algo;

/**
 *  给定一个 double 类型的浮点数 base 和 int 类型的整数 exponent，
 *  求 base 的 exponent 次方。
 *
 *  求解：
 */
public class Solution16 {
    public double Power(double base, int exponent){
        if(exponent == 0)
            return 1;
        if(exponent == 1)
            return base;
        boolean isNegative = false;
        if(exponent < 0){
            exponent = -exponent;
            isNegative = true;
        }
        double ret = 1.0;
        for(int i=0;i<exponent;i++){
            ret *= base;
        }
        return isNegative?1/ret:ret;
    }
}
