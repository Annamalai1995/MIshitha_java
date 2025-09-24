package Core_java.Operator;

import java.util.Scanner;

public class Arithmertic {
    public static void main(String[] args) {

        int data=500;
        int data1=200;
        int output;
        output=data+data1;
        System.out.println("Addition:"+output);
        output=data-data1;
        System.out.println("Subtraction is:"+output);
        output=data*data1;
        System.out.println("Multiply is "+output);
        output=data/data1;
        System.out.println("Divide:"+output);
        output=data%data1;
        System.out.println("Modulo:"+output);


        Scanner scan= new Scanner(System.in);
        int value=scan.nextInt();
        int value1=scan.nextInt();
        int result=value1+value;
        System.out.println("The value is :"+result);


    }
}
