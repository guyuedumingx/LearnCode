package leetcode.editor.cn;

//使用队列实现栈的下列操作： 
//
// 
// push(x) -- 元素 x 入栈 
// pop() -- 移除栈顶元素 
// top() -- 获取栈顶元素 
// empty() -- 返回栈是否为空 
// 
//
// 注意: 
//
// 
// 你只能使用队列的基本操作-- 也就是 push to back, peek/pop from front, size, 和 is empty 这些操作是合
//法的。 
// 你所使用的语言也许不支持队列。 你可以使用 list 或者 deque（双端队列）来模拟一个队列 , 只要是标准的队列操作即可。 
// 你可以假设所有操作都是有效的（例如, 对一个空的栈不会调用 pop 或者 top 操作）。 
// 
// Related Topics 栈 设计 
// 👍 225 👎 0

import java.util.LinkedList;

public class ImplementStackUsingQueues{
    public static void main(String[] args) {
        MyStack myStack = new ImplementStackUsingQueues().new MyStack();
        myStack.push(3);
        myStack.push(4);
        int pop = myStack.pop();
        System.out.println(pop);
        myStack.push(7);
        int top = myStack.top();
        myStack.empty();
    }

//leetcode submit region begin(Prohibit modification and deletion)
class MyStack {

    private LinkedList<Integer> list = new LinkedList<Integer>();
    int len = 0;

    /** Initialize your data structure here. */
    public MyStack() {

    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        list.add(x);
        len ++;
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        for (int i=--len; i>0; i--) {
            list.add(list.poll());
        }
         return list.poll();
    }
    
    /** Get the top element. */
    public int top() {
        int temp = 0;
        for (int i=len; i>0; i--) {
            temp = list.poll();
            list.add(temp);
        }
        return temp;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return  list.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
//leetcode submit region end(Prohibit modification and deletion)

}