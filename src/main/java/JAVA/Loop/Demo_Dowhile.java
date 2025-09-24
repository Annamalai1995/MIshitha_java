package Core_java.Loop;

import java.util.Scanner;

public class Demo_Dowhile {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int staff=0;
        float time=0;
        int count=0;
        do {
            System.out.println(staff+"Staff enter login");
            time=scan.nextFloat();
            if(time>9.30)
            {
                System.out.println(time+"you are late comer salary deudted 10%");
                count++;


            }
            else {
                System.out.println("you are correct login");

            }
            staff++;


        }while (staff>5);
        System.out.println("this month later comer:"+count);

    }
}
