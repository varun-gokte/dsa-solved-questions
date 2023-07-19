import java.util.Stack;

class MinStack 
{
    Stack<Integer> stack = new Stack<>();//   512
    Stack<Integer> minVal=new Stack<>();// 512
    
    public void push(int val) 
    {
        if (minVal.isEmpty() || val<=minVal.peek())
            minVal.push(val);
        stack.push(val);        
    }
    
    public void pop() 
    {
        if (stack.peek().equals(minVal.peek()))
            minVal.pop();
        stack.pop();
    }
    
    public int top() 
    {
        return stack.peek();
    }
    
    public int getMin() 
    {
        return minVal.peek();    
    }
}