package algo;

/**
 *  给定一个二维数组，其每一行从左到右递增排序，
 * 从上到下也是递增排序。给定一个数，判断这个数是否在该二维数组中。
 *
 * 思路：从右上角元素开始找，因为右上角元素其左边元素比他小，下边元素比他大，
 * 类似折半查找。
 */
public class Solution2 {

    public static boolean Find(int target, int[][] matrix){
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;
        int rows = matrix.length, cols = matrix[0].length;
        int r = 0, c = cols - 1; // 从右上角开始
        while (r <= rows - 1 && c >= 0){
            if(target == matrix[r][c])
                return true;
            else if(target > matrix[r][c])
                r++;
            else
                c--;
        }
        return false;
    }

    public static void main(String[] args){
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},
                {10,13,14,17,24},{18,21,23,26,30}};
        int target = 23;
        System.out.println(Find(target, matrix));
    }
}
