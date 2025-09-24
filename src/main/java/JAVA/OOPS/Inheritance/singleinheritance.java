package JAVA.OOPS.Inheritance;
class College {
    public void Students()
    {
        System.out.println("Sona college");
    }
}
class management extends  College{
    public  void IT()
    {
        System.out.println("IT students are bright ");
    }
}
public class singleinheritance {
    public static void main(String[] args) {
        management mm = new management();
        mm.IT();
        mm.Students();
    }

}
