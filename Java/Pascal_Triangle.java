import java.util.*;
class Pascal_Triangle
{
    List<List<Integer>> generate(int numRows)
    {
        List<List<Integer>> pascal = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        pascal.add(list);

        for (int i=1; i<numRows; i++)
        {
            List<Integer> prev_row = pascal.get(i-1);
            List<Integer> curr_row = new ArrayList<>();

            curr_row.add(1);

            for (int j=1; j<i; j++)
                curr_row.add(prev_row.get(j-1)+prev_row.get(j));
            
            curr_row.add(1);
            pascal.add(curr_row);
        }
        return pascal;
    }
}