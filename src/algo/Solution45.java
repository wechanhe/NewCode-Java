package algo;

import java.util.LinkedList;
import java.util.Queue;

/**
 *  字符流中第一个不重复的字符
 *  思路：定义一个长度为256的计数数组存储每个元素出现的次数，定义一个队列存储
 *  字符流，每次入队一个元素，检查队首元素是否为重复元素，如果是则删除，那么
 *  队头元素就是第一个无重复的字符。
 *  关键点：队列先进先出，记录第一次；计数数组记录是否重复。
 */
public class Solution45 {
    private int[] cnts = new int[256];
    private Queue<Character> queue = new LinkedList<>();

    public void Insert(char ch){
        cnts[ch]++;
        queue.add(ch);
        while (!queue.isEmpty() && cnts[queue.peek()] > 1)
            queue.poll();
    }

    public char FirstAppearingOnce(){
        return queue.isEmpty()?'#':queue.peek();
    }
}
