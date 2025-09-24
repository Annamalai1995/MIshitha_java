package JAVA.OOPS.Inheritance.Multiple;

public class multipleinheritance implements mall,mall1,mall2{
    @Override
    public void lulumall() {
        System.out.println("Its located at Kerala");
    }

    @Override
    public void Reliance() {
        System.out.println("Its located India");

    }

    @Override
    public void phonenix() {
        System.out.println("Its a located Tamilnadu");

    }

    public static void main(String[] args) {
        multipleinheritance mh = new multipleinheritance();
        mh.lulumall();
        mh.phonenix();
        mh.Reliance();
    }
}
