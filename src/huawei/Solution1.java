package huawei;

import java.util.Scanner;

/**
 *  计算字符串最后一个单词的长度，单词以空格隔开。
 */
public class Solution1 {
    public static int lengthOfLast(String str){
        String[] s = str.split(" ");
        return s[s.length-1].length();
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.nextLine();
            System.out.println(lengthOfLast(str));
        }
    }
}
