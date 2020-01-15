package algo;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 *  滑动窗口的最大值
 */
public class Solution65 {
    public ArrayList<Integer> maxInWindows(int[] num, int size){
        ArrayList<Integer> ret = new ArrayList<>();
        if(size > num.length || size < 1)
            return ret;
        PriorityQueue<Integer> heap = new PriorityQueue<>(((o1, o2) -> o2-o1));
        // 初始化一个大小为size的大顶堆
        for(int i=0;i<size;i++)
            heap.add(num[i]);
        ret.add(heap.peek());
        // 维护一个大小为size的大顶堆
        for (int i=0, j=i+size;j<num.length;i++,j++){
            heap.remove(num[i]);
            heap.add(num[j]);
            ret.add(heap.peek());
        }
        return ret;
    }
}
