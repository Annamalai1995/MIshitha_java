package JAVA.Constructor;

public class Parameter {
    int Rollno;
    String Name;
    String Dept;
    double cgpa;
    static int age;

//    public Parameter(int R,String n,String D,double c,int a)
//    {
//        //System.out.println(cgpa);
//        Rollno=R;
//        Name=n;
//        Dept=D;
//        cgpa=c;
//        age=a;
//
//
//
//    }

    public Parameter(int Rollno,String Name,String Dept,double cgpa,int age)
    {
       this.Rollno=Rollno;
        this.Name=Name;
        this.Dept=Dept;
       this. cgpa=cgpa;
       this. age=age;

    }

    public  void Display()
    {
        System.out.println("Rollno:"+Rollno+""+"Name"+Name+
                "Department"+Dept+"CGPA"+cgpa+"AGE "+age);

    }

    public static void main(String[] args) {
        Parameter pp = new Parameter(501,"Mishitha","IT",7.7,20);
        Parameter pp1=new Parameter(502,"Sowmiya","IT",8.3,20);
        pp.Display();
        pp1.Display();

    }

}
