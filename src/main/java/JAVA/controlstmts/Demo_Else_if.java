package Core_java.controlstmts;

import java.util.Scanner;

public class Demo_Else_if {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(("My company Details"));
        String emp_companyname=scan.next();
        if(emp_companyname.equalsIgnoreCase("Wipro"))
        {
            System.out.println("you are working IT Sector");
        }
        else if (emp_companyname.equalsIgnoreCase("sutherland"));
        {
            System.out.println("You are working in BPO sector");

        }

    }
}
