class Unique_Paths
{
    int uniquePaths(int m, int n)
    {
        return findNumber(0, 0, m,n);
    }

    int findNumber (int r, int c, int rows,int columns)
    {
        if (r==rows && c==columns)
            return 1;
        int right=0,down=0;
        if (c<columns)
            right=findNumber (r, c+1, rows, columns);
        if (r<rows)
            down=findNumber (r+1, c, rows, columns);
        return right+down;       
    }
}
/*       0 1 2
       0 X _
       1 _ _
       2 _ X
       3
 */