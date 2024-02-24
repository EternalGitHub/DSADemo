package FunctionDemo;

import java.util.Scanner;

public class AgeChecker
{
    public static boolean isElligible(int age)
    {
        //Check the condition using if
        if(age > 19)
        {
            System.out.println("Eliigible");
            return true;
        }
        System.out.println("Not Elligible");
        return false;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        System.out.println(isElligible(age));

    }

}
