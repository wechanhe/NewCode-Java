package algo;

/**
 * 地上有一个 m 行和 n 列的方格。一个机器人从坐标 (0, 0) 的格子开始移动，
 * 每一次只能向左右上下四个方向移动一格，
 * 但是不能进入行坐标和列坐标的数位之和大于 k 的格子。
 *
 * 解法：深度优先搜索
 */
public class Solution13 {
    private static final int[][] next = {{0,-1},{0,1},{-1,0},{1,0}};
    private int cnt = 0;
    private int rows;
    private int cols;
    private int threshold;
    private int[][] digitSum;

    private void initDigitSum(){
        int[] digitSumOne = new int[Math.max(rows, cols)];
        for (int i=0;i<digitSumOne.length;i++){
            int n=i;
            while (n>0){
                digitSumOne[i] += n%10;
                n /= 10;
            }
        }
        this.digitSum = new int[rows][cols];
        for(int i=0;i<this.rows;i++){
            for(int j=0;j<this.cols;j++)
                this.digitSum[i][j] = digitSumOne[i]+digitSumOne[j];
        }
    }

    private void dfs(boolean[][] marked, int r, int c){
        if(r<0 || r>=rows || c<0 || c>=cols || marked[r][c])
            return;
        marked[r][c] = true;
        if(this.digitSum[r][c] > this.threshold)
            return;
        cnt++;
        for(int[] n:next){
            dfs(marked, r+n[0],c+n[1]);
        }
    }

    public int movingCount(int threshold, int rows, int cols){
        this.rows = rows;
        this.cols = cols;
        this.threshold = threshold;
        initDigitSum();
        boolean[][] marked = new boolean[rows][cols];
        dfs(marked, 0, 0);
        return cnt;
    }
}
