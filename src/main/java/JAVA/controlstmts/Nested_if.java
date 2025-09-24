package JAVA.controlstmts;

public class Nested_if {
    public void nested(float cibil,double salary)
    {
        if(cibil>=750)    //outer if
        {
            System.out.println("You loan eligible");
            if(salary>=2.5 && salary<=3.5)  //inner if
            {
                System.out.println("Personal loan avaliable at 2 Lakhs only");
            }
            else if(salary>=4.5 && salary<=6.5)
            {
                System.out.println("Personal loan 10 Lakhs approved");

            } else if (salary>=8.5 && salary<=14.5) {
                System.out.println("Personal loan 20 Lakhs Approved");

            }
        }
        else {
            System.out.println("Not eliglible for your loan");
        }

    }
    public static void main(String[] args) {
        Nested_if nf= new Nested_if();
        nf.nested(850,2.5);
        nf.nested(860,7.5);
        nf.nested(900,12.5);
    }
}
