package JAVA.Exception;

import java.util.Scanner;

public class chance {
    static Scanner scan = new Scanner(System.in);
    public  static  void unlimit(String content)
    {
        try
        {
            System.out.println("Enter the starting String");
            int start=scan.nextInt();
            System.out.println("Enter Ending String");
            int end=scan.nextInt();
            System.out.println("My values"+content.substring(start,end));
        }catch (StringIndexOutOfBoundsException so)
        {
            System.out.println(so);
            System.out.println("Starting values is 0 ending values is "+content.length()+"\n please enter only 30 character ");
            unlimit(content);

        }

    }
    public  static void limit(String content,int chance)
    {
        try
        {
            System.out.println("Enter the starting String");
            int start=scan.nextInt();
            System.out.println("Enter Ending String");
            int end=scan.nextInt();
            System.out.println("My values"+content.substring(start,end));
        }catch (StringIndexOutOfBoundsException so)
        {
            System.out.println(so);
            System.out.println("Starting values is 0 ending values is "+content.length()+"\n please enter only 30 character ");
           if(chance < 3)
           {
               chance++;
               limit(content,chance);
           }
           else {
               System.out.println("Chance is over");
           }

        }
    }
    public static void main(String[] args) {
        String mydata="Dont judge a book by its cover";
        unlimit(mydata);
       // limit(mydata,1);

    }
}
