package algo;

import java.util.Stack;

/**
 *  定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的 min 函数。
 *  解法：定义两个栈，一个存放数据，一个存放最小值。每次压栈将栈顶元素与
 *  要压入的元素比较，将较小者压入最小值栈，这样可保证出栈后最小值栈栈顶元素
 *  仍为最小值。每次弹栈需要同时操作两个栈。
 */
public class Solution31 {
    private Stack<Integer> dataStack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public void push(int node){
        dataStack.push(node);
        minStack.push(minStack.isEmpty()?node:Math.min(minStack.peek(),node));
    }

    public void pop(){
        dataStack.pop();
        minStack.pop();
    }

    public int top(){
        return dataStack.peek();
    }

    public int min(){
        return minStack.peek();
    }
}
