class Roman_To_Integer
{
    int romanToInt(String s)
    {
        s+=" ";
        int i=0,num=0;
        while (i<s.length())
        {
            if (s.charAt(i)=='I')
            {
                if (s.charAt(i+1)=='V')
                {
                    num+=4;
                    i++;
                }
                else if (s.charAt(i+1)=='X')
                {
                    num+=9;
                    i++;
                }
                else
                    num+=1;
            }

            else if (s.charAt(i)=='V')
                num+=5;

            else if (s.charAt(i)=='X')
            {
                if (s.charAt(i+1)=='L')
                {
                    num+=40;
                    i++;
                }
                else if (s.charAt(i+1)=='C')
                {
                    num+=90;
                    i++;
                }
                else
                    num+=10;
            }

            else if (s.charAt(i)=='L')
                num+=50;

            else if (s.charAt(i)=='C')
            {
                if (s.charAt(i+1)=='D')
                {
                    num+=400;
                    i++;
                }
                else if (s.charAt(i+1)=='M')
                {
                    num+=900;
                    i++;
                }
                else
                    num+=100;
            } 

            else if (s.charAt(i)=='D')
                num+=500;

            else if (s.charAt(i)=='M')
                num+=1000;
            i++;
        }
        return num;
    }
    public static void main(String[] args) 
    {
        Roman_To_Integer rti = new Roman_To_Integer();
        String s="MCMXCIV";
        System.out.println (rti.romanToInt(s));
    }
}