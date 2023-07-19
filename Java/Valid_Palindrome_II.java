class Valid_Palindrome_II
{
    boolean validPalindrome(String s)
    {
        if (isPalindrome(s))
            return true;
        for (int i=0; i<s.length(); i++)
        {
            String str="";
            for (int j=0; j<s.length(); j++)
            {
                if (j!=i)
                    str+=s.charAt(j);
            }
            if (isPalindrome(str))
                return true;
        }
        return false;
    }

    boolean isPalindrome(String s)
    {
        int i,len=s.length();
        String str="";
        for (i=0; i<len; i++)
            str+=Character.toLowerCase(s.charAt(i));
        len=str.length();
        s="";
        for (i=len-1; i>=0; i--)
            s+=str.charAt(i);
        return s.equals(str);
    }

    public static void main(String[] args) {
        String x="abc";
        Valid_Palindrome_II obj = new Valid_Palindrome_II();
        System.out.println (obj.validPalindrome(x));
    }
}