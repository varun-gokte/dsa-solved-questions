import java.util.*;
class Valid_Sudoku
{
    boolean isValidSudoku(char[][] board)
    {
        HashSet<String> map = new HashSet<>();
        for (int i=0; i<9; i++)
        {
            for (int j=0; j<9; j++)
            {
                char num = board[i][j];
                if (num!='.' && (!map.add(num+" row "+i) || !map.add(num+" col "+j) || !map.add(num+" box "+ i/3+"-"+j/3)))
                    return false;
            }
        }
        return true;
    }
}