import java.util.Stack;

class Min_Ele_from_Stack // in O(1) space complexity
{
    int minEle=-1;
    Stack<Integer> s= new Stack<>();

    /*returns min element from stack*/
    int getMin()
    {
    	// Your code here
    	if (s.isEmpty())
    	    minEle=-1;
    	return minEle;
    }
    
    /*returns poped element from stack*/
    int pop()
    {
    	// Your code here
    	int y=-1;
    	int x=-1;
    	if (!s.isEmpty())
    	{
    	    y=s.pop();
    	    if (y<minEle)
    	    {   
    	        x=minEle;
    	        minEle=2*minEle-y;
    	    }
    	    else
    	        x=y;
            
    	}
    	return x;
    }

    /*push element x into the stack*/
    void push(int x)
    {
    	// Your code here
	    if (s.isEmpty()==true)
	    {
	        minEle=x;
	        s.push(x);
	    }
	    else if (x>=minEle)
	        s.push(x);
	    else
	    {
	        s.push(2*x-minEle);
	        minEle=x;
	    }
    }	
}