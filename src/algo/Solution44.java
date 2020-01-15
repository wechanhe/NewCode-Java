package algo;

import java.util.PriorityQueue;

/**
 *  数据流中的中位数
 *  思路：用两个堆实现，其中序列的左半部分用大顶堆存储，右边部分用小顶堆存储
 *  那么取中间元素就是两个堆顶的平均值，或者奇数的时候取右堆的堆顶元素。
 *  该问题可以推广到取任意第k小元素。
 */
public class Solution44 {
    // 大顶堆，存储左半边元素
    private PriorityQueue<Integer> left = new PriorityQueue<>((o1, o2) -> o2-o1);
    // 小顶堆，存储右半边元素，且右半边都大于左半边
    private PriorityQueue<Integer> right = new PriorityQueue<>();
    // 当前数据流读入的元素个数
    private int N = 0;

    public void Insert(Integer val){
        if(N % 2 == 0){     // 插右边
            left.add(val);
            right.add(left.poll());
        }else {             // 插左边
            right.add(val);
            left.add(right.poll());
        }
        N++;
    }

    public Double GetMedian(){
        if(N % 2 == 0)
            return (left.peek() + right.peek()) / 2.0;
        else
            return (double)right.peek();
    }
}
