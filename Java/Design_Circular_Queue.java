class MyCircularQueue 
{
    int cap;
    int front,rear;
    int[] arr;
    private int next(int i)
    {
        i++;
        if (i<cap)
            return i;
        else
            return i-cap;
    }

    public MyCircularQueue(int k) 
    {
        cap=k;
        arr = new int[cap];
        front=-1;
        rear=-1;   
    }
    
    public boolean enQueue(int value) 
    {
        if (isFull())
            return false;

        if (front==-1 && rear==-1)
        {
            front=0;
            rear=0;
        }        
        else
            rear=next(rear);

        arr[rear]=value;
        return true;
    }
    
    public boolean deQueue() 
    {
        if (isEmpty())
            return false;
        if (front==rear)
        {
            front=-1;
            rear=-1;
        }
        else
            front=next(front);
        
        return true;
    }
    
    public int Front() 
    {
        if (front==-1)
            return -1;
        
        return arr[front];
    }
    
    public int Rear() 
    {
        if (rear==-1)
            return -1;

        return arr[rear];
    }
    
    public boolean isEmpty() 
    {
        return front==-1; 
    }
    
    public boolean isFull() 
    {
        if (front==-1)
            return false;
        
        return front==next(rear);
    }
}