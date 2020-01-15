package algo;

/**
 *  把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 *  输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 *
 *  解法：折半查找
 */
public class Solution11 {
    public int minNumberInRotateArray(int[] nums){
        if(nums.length == 0)
            return 0;
        int l = 0, h = nums.length-1;
        while(l<h){
            int m = l + (h-l)/2;
            if(nums[l] == nums[m] && nums[m] == nums[h])
                return minNumber(nums, l, h);
            else if(nums[m] <= nums[h]) // 说明后半部分是有序区间，前半部分是旋转数组
                h = m;
            else
                l = m + 1;
        }
        return nums[l];
    }
    private int minNumber(int[] nums, int l, int h){
        for(int i=l;i<h;i++){
            if(nums[i] > nums[i+1])
                return nums[i+1];
        }
        return nums[l];
    }
}
