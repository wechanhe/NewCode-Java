package algo;

/**
 *  和为 S 的两个数字：输入一个递增排序的数组和一个数字 S，
 *  在数组中查找两个数，使得他们的和正好是 S。
 *  如果有多对数字的和等于 S，输出两个数的乘积最小的。
 *
 *  解答：双指针
 */

import java.util.ArrayList;
import java.util.Arrays;
public class Solution61 {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        int l = 0, h = array.length - 1;
        while(l < h){
            int s = array[l] + array[h];
            if(s == sum){
                return new ArrayList<Integer>(Arrays.asList(array[l],array[h]));
            }
            else if(s > sum)h--;
            else l++;
        }
        return new ArrayList<Integer>();
    }
}
