/*class Valid_Square
{
    boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4)
    {
            if (p1[0]==p2[0] || p1[1]==p2[0])
                double dis12=calcDist(p1,p2);
            else if (p2)

        }

        double dis12=calcDist(p1,p2);// d___c
        double dis23=calcDist(p2,p3);// |   |
        double dis34=calcDist(p3,p4);// a___b
        double dis41=calcDist(p4,p1);
        if (dis12==dis23 && dis12==dis34 && dis12==dis41)
            return true;
        else
            return false;
    }

    double calcDist (int[] a, int[] b)
    {
        double s1=Math.pow(a[0]-b[0],2);
        double s2=Math.pow(a[1]-b[1],2);
        return Math.sqrt(s1+s2);
    }

    public static void main(String[] args) 
    {
        Valid_Square vs = new Valid_Square();
        int[] p1={0,0};
        int[] p2={1,1};
        int[] p3={1,0};
        int[] p4={0,1};
        System.out.println (vs.validSquare(p1,p2,p3,p4));
    }
}*/