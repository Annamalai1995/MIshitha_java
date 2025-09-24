package Core_java.Array;

import java.util.Arrays;

public class Demo_create {
    public static void main(String[] args) {
        //Syntax
        //Array Create
        //datatype arrayname[]
        //datatype[]arrayname;
        //Instantiation
        //datatype arrayname=new datatype[size];
        //int a[]=new int(5)

        String place[]={"Salem","chennai","Bangalore","Hyderabad","Coimabatore"};
        //System.out.println("Array Values:"+place);
        System.out.println("Array VAlues:"+Arrays.toString(place));
        //Another Method
//        for(int i=0;i<=place.length;i++)
//        {
//            System.out.println("Array values:"+place[i]);
//        }
        System.out.println("Length Values:"+place.length);
        //Array Each
        //syntax:
//        for(variablename:arrayanme)
//        {
//            stmts
//        }
        for(String places:place)
        {
            System.out.println(places);
        }








    }
}
