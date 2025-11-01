package JAVA.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StringException
{
    public static void main(String[] args) {
        String data="Nothing More than Happiness";
        Scanner scan = new Scanner(System.in);
        try
        {
            System.out.println("Please enter start point");
            System.out.println(data.charAt(scan.nextInt()));


        }catch (StringIndexOutOfBoundsException se)
        {
            System.out.println(se);
            System.out.println("Index number  15 character"+data.length());
            System.out.println(data.charAt(scan.nextInt()));
        }
        catch (InputMismatchException ie)
        {
            System.out.println(ie);
        }
        finally {
            System.out.println("thanks you ");
        }

    }
}
