package Core_java.Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class UpdateArray {
    public static void main(String[] args) {
        String cricketer[]={"Dhoni","Virat","Gill"};
        //cricketer[2]="ABD";
    //    System.out.println("Array VAlues:"+ Arrays.toString(cricketer));
        UpdateArray up=new UpdateArray();
        System.out.println("Before Update Array:"+ Arrays.toString(cricketer));
        Scanner scan = new Scanner(System.in);
        System.out.println("tell us Index position");
        int index=scan.nextInt();
        System.out.println("Selected position:"+index+"Position values"+cricketer[index]);
        System.out.println("please enter new cricketerName");
        String name=scan.next();
        cricketer[index]=name;
        System.out.println("After Update values:"+Arrays.toString(cricketer));

    }
}
