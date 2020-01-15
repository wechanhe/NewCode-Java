package algo;

/**
 * 将一个字符串中的空格替换成 "%20"。
 * 思路：双指针——先根据空格数量给原来字符串扩充空间，然后复制原字符串到新空间。
 */
public class Solution3 {
    public String replaceSpace(StringBuffer str){
        int P1 = str.length() - 1; //旧边界
        for(int i=0;i<=P1;i++) {
            if (str.charAt(i) == ' ')
                str.append("  ");
        }
        int P2 = str.length() - 1; //新边界
        while (P1 >= 0 && P2 > P1){
            char c = str.charAt(P1--);
            if(c == ' '){
                str.setCharAt(P2--, '0');
                str.setCharAt(P2--, '2');
                str.setCharAt(P2--, '%');
            }else {
                str.setCharAt(P2--, c);
            }
        }
        return str.toString();
    }
}
