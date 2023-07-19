import java.util.*;
class Generate_Parentheses
{
    List<String> generateParenthesis(int n)
    {
        List<String> list = new ArrayList<>();
        backtrack (list,"",0,0,n);
        return list;
    }

    void backtrack (List<String> list, String str, int open, int close, int n)
    {
        if (str.length()==2*n)
        {
            list.add(str);
            return;
        }

        if (open<n)
            backtrack (list, str+"(", open+1, close, n);
        if (close<open)
            backtrack (list, str+")", open, 1+close, n);
    }
}