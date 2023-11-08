package OOPSConcept;

public class Pattern
{
    public static void main(String[] args)
    {
        starPattern(6);
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
}
