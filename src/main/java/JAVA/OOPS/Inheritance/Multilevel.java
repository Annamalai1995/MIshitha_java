package JAVA.OOPS.Inheritance;
class Bio
{
    public void bio()
    {
        System.out.println("MISHITHA ");
    }
}
class details extends Bio{
    public  void Data()
    {
        System.out.println("IT");
        System.out.println("Sona college ");

    }
}
class college extends details
{
    public void print()
    {
        System.out.println("Salem");
        System.out.println("Tamilnadu ");
    }
}
public class Multilevel {
    public static void main(String[] args) {
        college cc= new college();
        cc.bio();
        cc.Data();
        cc.print();
    }
}
