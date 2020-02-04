package leetcode_learn.算法思想.双指针;

/**
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 *
 */

public class Solution5 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx = 1, i = m-1, j = n-1;
        while (i >= 0 && j >= 0){
            if(nums1[i] > nums2[j]) {
                nums1[m + n - idx] = nums1[i--];
            }else {
                nums1[m + n - idx] = nums2[j--];
            }
            idx++;
        }
        while (i >= 0) {
            nums1[m + n - idx] = nums1[i--];
            idx++;
        }
        while (j >= 0) {
            nums1[m + n - idx] = nums2[j--];
            idx++;
        }
    }

}

class Main1{
    public static void main(String[] args){
        int[] nums1={1,2,3,0,0,0};
        int m=3;
        int[] nums2={2,5,6};
        int n=3;
        Solution5 solution5 = new Solution5();
    }
}