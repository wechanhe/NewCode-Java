package algo;

/**
 *  把字符串转换成整数
 */
public class Solution70 {
    public int StrToInt(String str) {
        if(str == null || str.length() == 0)
            return 0;
        char[] chars = str.toCharArray();
        int ret = 0, term = 1;
        for(int i=chars.length-1;i>0;i--){
            if(chars[i] < '0' || chars[i] > '9')
                return 0;
            ret += (chars[i]-'0')*term;
            term *= 10;
        }
        if(chars[0] == '+')
            return ret;
        else if(chars[0] == '-')
            return -ret;
        else if(chars[0] < '0' || chars[0] > '9')
            return 0;
        return ret + (chars[0]-'0')*term;
    }
}
