package leetcode.复杂度;

/**
 * 现在有一个整数类型的数组，数组中素只有一个元素只出现一次，其余的元素都出现两次。
 * 你需要给出一个线性时间复杂度的算法，你能在不使用额外内存空间的情况下解决这个问题么？
 */

public class Solution1 {
    public static int singleNumber(int[] A) {
        int num = 0;
        for(int i=0;i<A.length;i++){
            num^=A[i];
        }
        return num;
    }

    public static void main(String[] args){
        int[] A = {1,2,1,2,3,3,4,5,5,5};
        System.out.println(singleNumber(A));
    }
}
