package leetcode_learn.算法思想.双指针;

/**
 * 给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。
 */

public class Solution4 {
    public boolean validPalindrome(String s) {
        int i = 0, j = s.length()-1;
        if (s == null || s.equals("") || s.length() > 50000)
            return false;
        while (i < j){
            if (s.charAt(i) != s.charAt(j)){
                if (!isPalindrome(s, i+1, j) && !isPalindrome(s, i, j-1))
                    return false;
                else
                    return true;
            }
            i++; j--;
        }
        return true;
    }

    private boolean isPalindrome(String s, int i, int j){
        while (i < j){
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++; j--;
        }
        return true;
    }


}
class Main{
    public static void main(String[] args){
        String s = "eedede";
        Solution4 solution4 = new Solution4();
        System.out.println(solution4.validPalindrome(s));
    }
}