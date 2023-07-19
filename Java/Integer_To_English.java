class Integer_To_English 
{
    String numberToWords(int num) //Converts N into words
    {
        int N=num;
        int t,l=0,i=0,number,arr[],a,b;
        String res="";
        String[] words={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety","Hundred", "", "Thousand", "Million", "Billion"};
        //Store word equivalent for basic numberbers, from which others will be derived
        t=N;
        while (t!=0)
        {
            t/=10;
            l++;
        }
        t=N;
        arr=(l%3==0)?new int[l/3]:new int[l/3+1];
        while (i<arr.length) //To split N into groups of three
        {
            arr[i++]=t%1000;
            t/=1000;
        }
        i--;
        if (N==0)
            res="Zero";
        else 
            while (i>=0)
            {
                a=0;
                b=0;
                number=arr[i];
                a=number/100; //The first digit of number
                b=number%100; //The last two digits of number
                if (a!=0)
                    res+=(words[a]+" "+words[28]);
                if ((a!=0 && b!=0) || (i<arr.length-1 && arr[i]!=0 && arr[i+1]!=0 && a!=0 && b!=0))
                    res+=" ";
                if (b<=20)
                    res+=words[b];
                else
                    res+=words[b/10+18] + " " + words[b%10];
                if (number!=0)
                    res+=" " + words[i+29];
                i--;
            }
        /*if (res.charAt(res.length()-1)==' ')
        {
            String r=res.substring(0,res.length()-2);
            res=r;
            System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        }*/
        return res;
    }

    public static void main(String[] args) {
        Integer_To_English ite = new Integer_To_English();
        int num=30;
        System.out.println (ite.numberToWords(num));
    }
}