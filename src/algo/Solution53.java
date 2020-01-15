package algo;

/**
 *  第一个只出现一次的字符位置
 */
public class Solution53 {
    public int FirstNotRepeatingChar(String str){
        int[] cnts = new int[256];
        for(int i=0;i<str.length();i++)
            cnts[str.charAt(i)]++;
        for(int i=0;i<str.length();i++) {
            if (cnts[str.charAt(i)] == 1)
                return i;
        }
        return -1;
    }
}
