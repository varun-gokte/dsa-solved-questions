class Add_Digits
{
    int addDigits(int num)
    {
        if (num<10)
            return num;
        int temp=num,count=0,sum=0;
        while (temp!=0)
        {
            temp/=10;
            count++;
        }
        int[] arr = new int[count];
        temp=num;
        while (temp!=0)
        {
            arr[--count]=temp%10;
            temp/=10;
        }
        for (int i=0; i<arr.length; i++)
            sum+=arr[i];
        return addDigits(sum);
    }

    public static void main(String[] args) 
    {
        Add_Digits ad = new Add_Digits();
        int x=38;
        System.out.println (ad.addDigits(x));
    }
}