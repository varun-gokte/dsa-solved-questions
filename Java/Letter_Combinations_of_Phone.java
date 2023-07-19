import java.util.LinkedList;
import java.util.List;

class Letter_Combinations_of_Phone
{
    List<String> letterCombinations(String digits)
    {
        LinkedList<String> queue = new LinkedList<>();
        String[] map = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        queue.add("");
        for (int i=0; i<digits.length(); i++)
        {
            int current_digit=Character.getNumericValue(digits.charAt(i));
            while (queue.peek().length()==i)
            {
                String current_permutation=queue.remove();
                for (char c : map[current_digit].toCharArray())
                    queue.add(current_permutation+c);                
            }
        }
        return queue;
    }
}