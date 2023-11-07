package OOPSConcept;

import java.util.Scanner;

public class ReverseString
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String-: ");
        String k = sc.next();


       // String s = "veer";

        String j = "";
        for(int i=k.length()-1; i>=0;i--)
        {
            j = j+k.charAt(i);
        }
        System.out.println(j);
    }


}

