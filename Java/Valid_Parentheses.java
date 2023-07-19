import java.util.*;

class Valid_Parentheses
{
    boolean isValid(String s)
    {
        boolean flag=false;
        int i=0;
        Stack<Character> list = new Stack<Character>();
        while (i<s.length())
        {
            char b=s.charAt(i);
            if (b=='{' || b=='[' || b=='(')
                list.push(b);
            else if (list.isEmpty()==false)
            {
                char a=list.pop();
                if ((a=='{' && b=='}') || (a=='[' && b==']') || (a=='(' && b==')'))
                    flag=true;
                else
                    return false;
            }
            else
                return false;
            i++;
        }
        if (list.isEmpty()==false)
            flag=false; 
        return flag;
    }
}