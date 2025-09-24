package Core_java.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Insert {
    public static void main(String[] args) {
        int arrayname[]=new int[5];
//        arrayname[0]=15;
//        arrayname[1]=20;
//        arrayname[3]=15;
//        System.out.println(Arrays.toString(arrayname));
        Scanner scan = new Scanner(System.in);
        for(int arr=0;arr<arrayname.length;arr++)
        {
            System.out.println("Enter ARray values");
            arrayname[arr]=scan.nextInt();

        }
        for(int Mishitha:arrayname)
        {
            System.out.println(Mishitha);
        }


    }
}
