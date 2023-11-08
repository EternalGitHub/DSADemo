package OOPSConcept;

public class Pattern
{
    public static void main(String[] args)
    {
        starPattern(6);
        triangleStarPattern(7);
    }

    public static void starPattern(int n)
    {
        int i,j;

        for(i=0; i< n; i++)
        {
            System.out.print(" ");

            for(j =0; j<=i; j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }

    public static void triangleStarPattern(int k)
    {
        int m,n;

        for(n=0; n<k; n++)
        {
            System.out.print(" ");

            for(m=n; m<=k;m++)
            {
                System.out.print(" + ");
            }
            System.out.println();
        }
    }
}
