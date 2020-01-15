package algo;

import java.util.Arrays;

/**
 *  把数组排成最小的数:
 *      看成排序问题，字符串S1和S2比较：S1+S2与S2+S1比较
 */
public class Solution48 {
    public String PrintMinNumber(int[] numbers){
        if(numbers == null || numbers.length == 0)
            return "";
        int n = numbers.length;
        String[] nums = new String[n];
        for(int i=0;i<n;i++)
            nums[i] = numbers[i]+"";
        Arrays.sort(nums, (s1,s2)->(s1+s2).compareTo(s2+s1));
        String ret = "";
        for(String str:nums)
            ret += str;
        return ret;
    }
}
