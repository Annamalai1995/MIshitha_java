package JAVA.OOPS.Inheritance.Encapsulation;

public class Dmart_class  extends Dmart {
    public static void main(String[] args) {
//        Dmart dd= new Dmart();
        Dmart_class dd= new Dmart_class();
        dd.setProduct_id(101);
        dd.setProduct_name("Bag");
        dd.setCategeory("LEather");
        dd.setQuantity(250);
        dd.setPrice(1250);
        System.out.println(dd.getProduct_id()+""+dd.getProduct_name()
        +""+dd.getCategeory()+""+dd.getQuantity()+""+dd.getPrice());

    }
}
