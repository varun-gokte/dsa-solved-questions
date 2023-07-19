class Valid_Palindrome
{
    boolean isPalindrome(String s)
    {
        int i,len=s.length();
        String str="";
        for (i=0; i<len; i++)
            if (Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i)))
                str+=Character.toLowerCase(s.charAt(i));
        len=str.length();
        for (i=0; i<len/2; i++)
            if (str.charAt(i)!=str.charAt(len-1-i))
                return false;
        return true;
    }

    public static void main(String[] args) 
    {
        Valid_Palindrome obj = new Valid_Palindrome();
        String x="a";
        System.out.println (obj.isPalindrome(x));  
    }
}

/*ALT: 
    boolean isPalindrome(String s)
    {
        int i,len=s.length();
        String str="";
        for (i=0; i<len; i++)
            if (Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i)))
                str+=Character.toLowerCase(s.charAt(i));
        len=str.length();
        s="";
        for (i=len-1; i>=0; i--)
            s+=str.charAt(i);
        return s.equals(str);
    }


  ALT2:
    boolean isPalindrome(String s)
    {
        int i,len=s.length();
        String str="",rev="";
        Stack<Character> venator = new Stack<Character>();
        for (i=0; i<len; i++)
            if (Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i)))
            {
                venator.push(Character.toLowerCase(s.charAt(i)));
                str+=Character.toLowerCase(s.charAt(i));
            }
        while (venator.isEmpty()==false)
            rev+=venator.pop();
        return rev.equals(str);
    }*/