package leetcode_learn.算法思想.双指针;


/**
 * 在 升序排列 有序数组中找出两个数，使它们的和为 target。
 */

public class Solution1 {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        int[] res = new int[2];
        while (i < j){
            int sum = numbers[i] + numbers[j];
            if (sum == target){
                res[0] = i+1;
                res[1] = j+1;
                break;
            }else if(sum < target){
                i++;
            }else {
                j--;
            }
        }
        return res;
    }
}
