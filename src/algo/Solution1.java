package algo;

/**
 * 在一个长度为 n 的数组里的所有数字都在 0 到 n-1 的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字是重复的，也不知道每个数字重复几次。
 * 请找出数组中任意一个重复的数字。要求时间复杂度 O(N)，空间复杂度 O(1)
 *
 * 思路：将值为 i 的元素调整到第 i 个位置上进行求解，如果值为i的元素，在第i个位置
 *      的值也是i，那么就是有重复。
 */
public class Solution1 {

    private static void swap(int[] nums, int i, int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static boolean duplicate(int numbers[],int length,int [] duplication) {
        if(numbers == null || length <= 0)
            return false;
        for(int i=0;i<length;i++){
            while (numbers[i] != i){
                if(numbers[i] == numbers[numbers[i]]){
                    duplication[0] = numbers[i];
                    return true;
                }
                swap(numbers, i, numbers[i]);
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] nums = {2,3,1,0,2,5};
        System.out.println(duplicate(nums, nums.length,null));
    }
}
