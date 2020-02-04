package leetcode_learn.算法思想.双指针;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个字符串和一个字符串字典，找到字典里面最长的字符串，该字符串可以通过删除给定字符串的某些字符来得到。
 * 如果答案不止一个，返回长度最长且字典顺序最小的字符串。如果答案不存在，则返回空字符串。

 */
public class Solution7 {
    public String findLongestWord(String s, List<String> d) {
        String maxStr = "";
        for (String str : d){
            int i = 0, j = 0;
            while (i < s.length() && j < str.length()){
                if (s.charAt(i) != str.charAt(j)){
                    i++;
                }else {
                    i++; j++;
                }
            }
            if (j == str.length()){
                if (str.length() > maxStr.length()){
                    maxStr = str;
                }else if(str.length() == maxStr.length()){
                    maxStr = (str.charAt(0) < maxStr.charAt(0))?str:maxStr;
                }
            }
        }
        return maxStr;
    }
}

class Main7{
    public static void main(String[] args){
        Solution7 solution7 = new Solution7();
        System.out.println(solution7.findLongestWord("abpcplea", new ArrayList<>(Arrays.asList("ale","apple","monkey","plea"))));
    }
}
