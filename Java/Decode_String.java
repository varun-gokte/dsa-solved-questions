import java.util.Stack;

class Decode_String
{
    String decodeString(String s)
    {
        Stack<Integer> counts = new Stack<>();
        Stack<String> codes = new Stack<>();

        int i=0;
        String res="";
        
        while (i<s.length())
        {
            if (Character.isDigit(s.charAt(i)))
            {
                int c=0;

                while (Character.isDigit(s.charAt(i)))
                {    
                    c=c*10 + (s.charAt(i)-'0');
                    i++;
                }
                counts.push(c);
            }

            else if (s.charAt(i)=='[')
            {
                codes.push(res);
                res="";
                i++;
            }

            else if (s.charAt(i)==']')
            {
                StringBuilder temp = new StringBuilder();
                int c=counts.pop();
                
                temp.append(codes.pop());

                for (int j=0; j<c; j++)
                    temp.append(res);
                res=temp.toString();
                i++;
            }

            else
            {
                res+=s.charAt(i);
                i++;
            }
        }

        return res;
    }
}