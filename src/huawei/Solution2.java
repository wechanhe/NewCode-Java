package huawei;

import java.util.Scanner;

/**
 *  计写出一个程序，接受一个由字母和数字组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
 */
public class Solution2 {
    public static int numberOfchar(String str, char ch){
        int res = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ch )
                res++;
            else if(Math.abs(str.charAt(i) - ch) == ('a'-'A'))
                res++;
        }
        return  res;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char ch = scanner.nextLine().charAt(0);
        System.out.println(numberOfchar(str, ch));
    }
}
