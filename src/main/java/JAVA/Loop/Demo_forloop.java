package Core_java.Loop;

import java.util.Scanner;

public class Demo_forloop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        for(int myrequirement=10;myrequirement>0;)
        {
            System.out.println("what is your experience");
            float experience=scan.nextFloat();

            if(experience>=4 && experience<=15)
            {
                Scanner scan1= new Scanner(System.in);
                System.out.println("Enter Skills");
                String language=scan1.nextLine();
                if(language.equalsIgnoreCase("java") || language.equalsIgnoreCase("python"))
                {
                    System.out.println("you are selected ");
                    myrequirement--;


                }
                else {
                    System.out.println("Try to update Skills");
                }


            }
            else {
                System.out.println("You are not eligible");
            }

        }
    }
}
