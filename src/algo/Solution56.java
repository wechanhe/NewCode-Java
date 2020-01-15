package algo;

/**
 *  数字在排序数组中出现的次数
 *  解答：折半查找分别获得目标元素起始与终止下标
 */
public class Solution56 {
    public int GetNumberOfK(int [] array , int k) {
        int first = binarySearch(array, k);
        int last = binarySearch(array, k+1);
        return (first == array.length || array[first] != k)?0:last-first;
    }
    private int binarySearch(int[] nums, int k){
        int l = 0, h = nums.length;
        while (l<h){
            int m = l+(h-l)/2;
            if(nums[m] >= k)
                h = m;
            else
                l = m + 1;
        }
        return l;
    }
}
