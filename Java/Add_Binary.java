class Add_Binary
{
    String addBinary(String a, String b)
    {
        int len=Math.max(a.length(),b.length());
        int numA[]=new int[len];
        int numB[]=new int[len];
        int i=a.length()-1;
        int j=b.length()-1;
        int k=len-1;
        int carry=0;
        String str="";
        while (k>=0)
        {
            if (i>=0)
                numA[k]=(int)a.charAt(i--)-48;
            if (j>=0)
                numB[k]=(int)b.charAt(j--)-48;
            k--;
        }
                                //        0 1 2 3  
        for (i=len-1; i>=0; i--) // numA=[1,1,1,1]
        {                        // numB=[1,1,1,1]
            numA[i]+=numB[i];    // num =[0,0,0,2]
            while (numA[i]>1)
            {
                numA[i]-=2;
                if (i==0)
                    carry++;
                else
                    numA[i-1]++;
            }
        }
        if (carry!=0)
            str+=carry;
        for (i=0; i<len; i++)
            str+=numA[i];
        return str;
    }

    public static void main(String[] args) 
    {
        String a = "1111", b = "1111";
        Add_Binary ab = new Add_Binary();
        System.out.println (ab.addBinary(a,b));
    }
}