package JAVA.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RuntimeExcep {
    public static void main(String[] args) {
        try
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the values");
            int a= scan.nextInt();
            System.out.println("Enter the values");
            int b= scan.nextInt();
            System.out.println(a/b);
        }catch (ArithmeticException ae)
        {
            System.out.println(ae);


        }catch (InputMismatchException ie)
        {
            System.out.println(ie);
            try
            {
                System.out.println("Enter the a values ");
                System.out.println("enter the B values");
                Scanner scan= new Scanner(System.in);
                System.out.println("Please enter values");
                int a= scan.nextInt();
                System.out.println("Please enter b values");
                int b= scan.nextInt();
                System.out.println(a/b);


            }catch (ArithmeticException e)
            {
                System.out.println(e);
            }

        }finally {
            System.out.println("Nandri");
        }
    }
}
