package JAVA.OOPS.Inheritance.Abstraction;

public class CarAccess  extends car{
    @Override
    public void accelarator() {
        System.out.println("Its a 220 Top speed");
    }

    @Override
    public void gear() {
        System.out.println("6 speed AUtomatic Gear ");
    }

    public static void main(String[] args) {
        car cc= new CarAccess();//Upcasting
        cc.accelarator();
        cc.Benz();
        cc.gear();

    }
}
