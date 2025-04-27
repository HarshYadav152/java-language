package OOPs;
class Modifiers{

    // we can achieve abstraction ( implement data hiding )
    // There are4 type of access modifiers
    /* 1-> private (can't access outside te class)
    *  2-> default (default agar koi nahi diya toh ye apne aap default hoga)
    *  3-> protected
    *  4-> public (ab tak jo dekha tha wo public tha accessible any where in the program after object creation of that class)
    * */

    // specified the access property for the class member and  member function
    int id;
    String name;
    // above both can be used outside the class

    private float salary; // we can't access from the outside the class
    // these can only be access by the member function

    public void showSalary(int i){ // this act as setter
        salary = i*100; // it can be access in member function
    }
    public float getSalary(){ // this act as getter
        return salary;
    }
}

public class Access_Modifiers {
    public static void main(String[] args) {
        Modifiers obj = new Modifiers();
        obj.id = 10;
        obj.name = "HHHHH";

//        obj.salary = 12;// this will give error (it is inaccessible)
        obj.showSalary(3);
        float salary = obj.getSalary();
        System.out.println(salary);
    }
}
