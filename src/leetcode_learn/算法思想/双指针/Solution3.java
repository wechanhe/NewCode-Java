package leetcode_learn.算法思想.双指针;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * 编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
 */

public class Solution3 {
    private static final Set<Character> set = new HashSet<>();

    public static String reverseVowels(String s) {
        Character[] chars = new Character[]{'a','e','i','o','u','A','E','I','O','U'};
        StringBuilder str = new StringBuilder(s);
        for (Character ch : chars){
            set.add(ch);
        }
        int i = 0, j = str.length()-1;
        while (i < j){
            if (set.contains(str.charAt(i)) && set.contains(str.charAt(j))){
                char tmp = str.charAt(i);
                str.setCharAt(i, str.charAt(j));
                str.setCharAt(j, tmp);
                i++;
                j--;
            }else if(set.contains(str.charAt(i))){
                j--;
            }else if (set.contains(str.charAt(j))){
                i++;
            }else {
                i++;
                j--;
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseVowels(s));
    }
}
