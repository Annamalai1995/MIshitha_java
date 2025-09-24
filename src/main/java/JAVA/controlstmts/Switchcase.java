package Core_java.controlstmts;

import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Tell us Vowels letter");
        String vowels=scan.next();
        switch (vowels)
        {
            case "a":
                System.out.println("A is Vowels ");
                break;
            case "e":
                System.out.println(" E is Vowels");
                break;
            case  "i":
                System.out.println("I is vowels");
                break;
            case "o":
                System.out.println("O is vowels");
                break;
            case "u":
                System.out.println(" U is Vowels");
                break;
            default:
                System.out.println("NOT A VOWELS");

        }

    }
}
