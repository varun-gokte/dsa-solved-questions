class Longest_Common_Prefix
{
    String longestCommonPrefix(String[] strs)
    {
        String prefix="";
        int i=0,j=0;

        if (strs.length==1)
            return strs[0];

        while(i<Math.min(strs[0].length(),strs[1].length()))    
            if(strs[0].charAt(i)==strs[1].charAt(i))
                prefix+=strs[0].charAt(i++);
            else
                break;

        for (i=2; i<strs.length; i++)
        {
            j=Math.min(prefix.length(),strs[i].length());
            boolean found=false;
            while (j>0)
            {
                if ((strs[i].substring(0,j)).equals(prefix.substring(0,j)))
                {    
                    prefix=prefix.substring(0,j);
                    found=true;
                    break;
                }
                else
                    j--;
            }
            if (found==false)
                prefix="";
        }
            
        return prefix;
    }

    public static void main(String[] args) 
    {
        Longest_Common_Prefix obj = new Longest_Common_Prefix();
        String[] strs={"flower"};
        System.out.println (obj.longestCommonPrefix(strs));
    }
}