package JAVA.Exception;

public class ArithmeticExce {
    public static void main(String[] args) {
//         int a=50;
//         int b=0;
//         int c=a/b;
//
//        System.out.println(c);

        try
        {
            int alpha=100;
            int beta=0;
            int gamma=alpha/beta;
            System.out.println("The values is "+gamma);
        }catch (ArithmeticException e)
        {
            System.out.println("Arithemetic Exception Error"+e);
        }
        System.out.println("Mishitha");
        int a=100;
        int b=150;
        int c=a+b;
        System.out.println(c);
    }
}
