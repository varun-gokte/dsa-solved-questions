class Excel_Sheet_Column_Number
{
    int titleToNumber(String columnTitle)
    {
        columnTitle=columnTitle.toUpperCase();
        int sum=0;
        for (int i=0; i<columnTitle.length(); i++)
            sum=sum*26 + columnTitle.charAt(i)-64;
        return sum;
    }
}


/*
 * int titleToNumber(String columnTitle)
    {
        columnTitle=columnTitle.toUpperCase();
        int sum=0;//AB
        int first=columnTitle.charAt(columnTitle.length()-1)-64;
        if (columnTitle.length()==1)
            return first;

        for (int i=0; i<columnTitle.length()-1; i++)
        {
            int ch=columnTitle.charAt(i)-64;//ch=B=2
            sum+=ch;
            System.out.println (ch);
        }

        return sum*26+first;
    }
 */
//A - 1
//Z - 26
//AA - 27 26+1
//AZ - 52 26+26
//BC - 55 26+26+3
//BZ - 78 26+26+26
//CA - 26+26+26+1