package leetcode.双指针;

/**
 *  有序数组的 Two Sum
 */
public class Solution1 {
    public int[] twoSum(int[] numbers, int target) {
        int[] ret = new int[2];
        if(numbers == null || numbers.length == 0)
            return ret;
        int l = 0, h = numbers.length-1;
        while(l<h){
            int sum = numbers[l] + numbers[h];
            if(sum == target){
                ret[0] = l+1;
                ret[1] = h+1;
                break;
            }else if(sum > target){
                h--;
            }else{
                l++;
            }
        }
        return ret;
    }
}
