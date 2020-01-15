package algo;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *  字符串的排列:
 *  输入一个字符串，按字典序打印出该字符串中字符的所有排列。
 *  例如输入字符串 abc，则打印出由字符 a, b, c 所能排列出来的所有字符串 abc, acb, bac, bca, cab 和 cba。
 *
 */
public class Solution41 {
    private ArrayList<String> ret = new ArrayList<>();

    public ArrayList<String> Permutation(String str){
        if(str.length() == 0)
            return ret;
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        backtracking(chars, new boolean[chars.length], new StringBuffer());
        return ret;
    }

    private void backtracking(char[] chars, boolean[] hasUsed, StringBuffer s){
        if(s.length() == chars.length){
            ret.add(s.toString());
            return;
        }
        for(int i=0;i<chars.length;i++){
            if(hasUsed[i])
                continue;
            if(i!=0 && chars[i]==chars[i-1] && !hasUsed[i-1])
                continue;
            hasUsed[i]=true;
            s.append(chars[i]);
            backtracking(chars,hasUsed,s);
            s.deleteCharAt(s.length()-1);
            hasUsed[i]=false;
        }
    }
}
