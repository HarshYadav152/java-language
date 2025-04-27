package packages;

//import java.util.Scanner; // only import Scanner class
//import java.util.*; // import all classes inside util package

import packages.C1;

class Access extends C1{
    void he(){
      System.out.println(x);
        System.out.println(y);
        System.out.println(z);
//        System.out.println(a); // it can't be access because it is private
}}

public class User {
    public static void main(String[] args) {
        // use Scanner class
        java.util.Scanner sc = new java.util.Scanner(System.in);// also we can do that
        Access_Modifier obj = new Access_Modifier();
        obj.hello(); // can also be access in other file while in same package
        Access obj2 = new Access();
        obj2.he();
    }
}
