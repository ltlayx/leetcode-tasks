/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * <p>
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 * Example:
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> Returns -3.
 * minStack.pop();
 * minStack.top();      --> Returns 0.
 * minStack.getMin();   --> Returns -2.
 */
public class Min_Stack_155 {
    /**
     * Your MinStack object will be instantiated and called as such:
     * MinStack obj = new MinStack();
     * obj.push(x);
     * obj.pop();
     * int param_3 = obj.top();
     * int param_4 = obj.getMin();
     */

    private int[] stack;

    private int point;

    private int depth;

    private int min;

    /** initialize your data structure here. */
    public Min_Stack_155() {
        depth = 1000;
        stack = new int[depth];
        point = -1;
        min = Integer.MAX_VALUE;
    }

    public void push(int x) {
        if(point == depth - 1){
            return;
        }
        else{
            point++;
            stack[point] = x;
            if(x < min){
                min = x;
            }
        }
    }

    public void pop() {
        if(point == -1){
            return;
        }else{
            if(stack[point] == min){
                min = Integer.MAX_VALUE;
                for(int i = 0; i < point; i++){
                    if(stack[i] < min){
                        min = stack[i];
                    }
                }
            }
            point--;
        }
    }

    public int top() {
        if(point == -1){
            return Integer.MIN_VALUE;
        }else{
            return stack[point];
        }
    }

    public int getMin() {
        if(point == -1){
            return Integer.MIN_VALUE;
        }
        return min;
    }
}
