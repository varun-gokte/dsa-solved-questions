import java.util.Stack;

class Evaluate_RPN
{
    public int evalRPN(String[] tokens)
    {
        Stack<Integer> stack = new Stack<>();

        for (int i=0; i<tokens.length; i++)
        {
            try
            {
                stack.push(Integer.parseInt(tokens[i]));
            }
            catch (NumberFormatException nfe)
            {
                int a=stack.pop();
                int b=stack.pop();

                if (tokens[i].charAt(0)=='+')
                    stack.push(a+b);
                else if (tokens[i].charAt(0)=='-')
                    stack.push(b-a);
                else if (tokens[i].charAt(0)=='*')
                    stack.push(a*b);
                else if (tokens[i].charAt(0)=='/')
                    stack.push(b/a);
            }
        }

        return stack.pop();
    }
}