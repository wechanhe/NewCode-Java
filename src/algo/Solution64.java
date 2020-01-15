package algo;

/**
 *  左旋转字符串
 */
public class Solution64 {
    public String LeftRotateString(String str,int n) {
        if(str == null || str.length() == 0 || n < 0)
            return "";
        int length = str.length();
        while(n > length)
            n %= length;
        StringBuilder s1 = new StringBuilder(str.substring(0, n));
        StringBuilder s2 = new StringBuilder(str.substring(n, length));
        return s2.append(s1).toString();
    }
}
