package Inheritance;

interface One{
    void show1();
}
interface Two{
    void show2();
}
class D implements One,Two{ // it is the basic implementation of the multiple inheritance
    @Override
    public void show1() {
        System.out.println("Override One method show1()");
    }
    @Override
    public void show2() {
        System.out.println("Override One method show2()");
    }
}
public class Multiple_Inheritance_using_interfaces{
    public static void main(String[] args) {
        D object = new D();
        object.show1();
        object.show2();
    }
}
