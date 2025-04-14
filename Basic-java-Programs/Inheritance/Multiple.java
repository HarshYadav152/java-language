package Inheritance;

class Base1{
    void show1(){
        System.out.println("Base1 ka show1");
    }
}
class Base2{
    void show1(){
        System.out.println("Base1 ka show1");
    }
}
//class Derived extends Base1,Base2{ // this is not possible in java due to different method signature
//    void show1(){
//        System.out.println("Derived ka show1");
//    }
//}

// Hierarchical possible
class Derived1 extends Base1{
    @Override
    void show1() {
        System.out.println("Hello from Derived1");
    }
}
class Derived2 extends Base1{
    void show2() {
        System.out.println("Hello from Derived2");
    }
}

public class Multiple{
    public static void main(String[] args) {

    }
}
