package JAVA.OOPS.Inheritance.Polymorphism;

public class Overloading {
    public void Add(int a,int b)
    {
        if(a==b)
        {
            System.out.println("The value is equals");
        }

    }
    public void Add(float a,float b)
    {
        float sum=a+b;
        System.out.println("The sum of Values is:"+sum);
    }
    public  void Add(String name,String name1)
    {
        if(name.equalsIgnoreCase(name1))
        {
            System.out.println("The same name is equals");
        }
    }

    public static void main(String[] args) {
        Overloading oo =new Overloading();
        oo.Add(125,125);
        oo.Add(10.5f,10.5f);
        oo.Add("Mishitha","mishitha");
    }
}
