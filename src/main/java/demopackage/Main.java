package demopackage ;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in) ;

        System.out.println("Enter your name:") ;

        String name = scan.next() ;

        int count = 0 ;

        while(name.length() > 0)
        {
            if (name.equalsIgnoreCase("bob"))
            {
                System.out.println("You are now signed in as " + name + ".") ;
                if (count == 1)
                {
                    System.out.println("...but you got it wrong once, dummy") ;
                }
                else if (count > 1)
                {
                    System.out.println("...but you got it wrong " + count + " times, dummy") ;
                }
                break ;
            }
            else if (name.equalsIgnoreCase("alice"))
            {
                System.out.println("You are now signed in as " + name + ".") ;
                if (count == 1)
                {
                    System.out.println("...but you got it wrong once, dummy") ;
                }
                else if (count > 1)
                {
                    System.out.println("...but you got it wrong " + count + " times, dummy") ;
                }
                break ;
            }
            else
            {
                System.out.println("Enter name") ;
                name = scan.next() ;
            }
            count++ ;
        }
    }
}