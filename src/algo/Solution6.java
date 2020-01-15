package algo;

/**
 *  用两个栈来实现一个队列，完成队列的 Push 和 Pop 操作。
 *  思路：in栈用来处理入栈操作，out栈用来处理出栈操作。
 *  细节：出栈时，先将in栈元素压入out栈
 */
import java.util.Stack;

public class Solution6 {
    Stack<Integer> in = new Stack<>();
    Stack<Integer> out = new Stack<>();
    public void push(int node){
        in.push(node);
    }
    public int pop() throws Exception{
        if(out.isEmpty()){
            while (!in.isEmpty())
                out.push(in.pop());
        }
        if(out.isEmpty())
            throw new Exception("queue is empty");
        return out.pop();
    }
}
