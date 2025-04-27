package Interfaces;
import com.sun.security.jgss.GSSUtil;

class Base{
    private int x;
    Base(){
        System.out.println("I am a Base Class constructor");
    }
    Base(int b){
        System.out.println("I am a Base Class overloaded constructor "+b);
    }
    public void showA(){
        System.out.println("Class Base method");
    }
}

class Derived extends Base{
    private int y;
    Derived(){
        super(2); // if it not found so it will call the default constructor
        System.out.println("I am a Derived class constructor called by the derivedofderived");
    }
    Derived(int d,int b){
        super(b); // it will call the parameterized constructor of the base class
        System.out.println("I am a Derived class overloaded constructor "+d);
    }
    public void showB(){
        System.out.println("Class Derived method");
    }
}
class DerivedofDerived extends Derived{
    DerivedofDerived(){
        super();
        System.out.println("Default DerivedofDerived constructor");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        // pehle base class ka constructor run hoga uske baad derived class ka
//        Derived obj = new Derived(2,34); // here base and derived class constructor run but first base class constructor run after that derived constructor run ( run top to bottom )
        // here Derived class parameterized constructor is run but for base it will default constructor
//        obj.showA(); // now showA() is now available in the derived class using inheritance

        DerivedofDerived obj2 = new DerivedofDerived();
    }
}
