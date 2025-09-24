package JAVA.String;

public class StringBuffer1 {
    public static void main(String[] args) {
        StringBuffer ss= new StringBuffer("Mishitha");
        //Append
        System.out.println(ss.append("Angellin"));
        //Insert
        System.out.println(ss.insert(1,"Angel"));
        //replace
        System.out.println(ss.replace(1,3,"Angel"));
        //delete
        System.out.println(ss.delete(1,3));
        //reverse
        System.out.println(ss.reverse());

            }
}
