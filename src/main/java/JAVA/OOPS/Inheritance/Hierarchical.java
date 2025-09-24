package JAVA.OOPS.Inheritance;
class Animal
{
    public  void Dog()
    {
        System.out.println("Bow Bow");
    }
}
class  Animal1 extends  Animal
{
    public  void cat()
    {
        System.out.println("Meow");
    }
}
class Animal2 extends Animal
{
    public  void cow()
    {
        System.out.println("MAAAAAAA ");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Animal2 aa= new Animal2();
        aa.Dog();
        aa.cow();
        Animal1 aa1= new Animal1();
        aa1.cat();
    }
}
