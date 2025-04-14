interface Sample1{
    void method1();
    void method2();
}
interface Sample2 extends Sample1{
//    void method1(); // for avoiding this we use inheritance in interfaces
//    void method2(); //
    void method3();
    void method4();
}
class SampleClass implements Sample2{
//    this is obvious
    @Override
    public void method3() { // from Sample2 interface
        System.out.println("Method 3");
    }
    @Override
    public void method4() { // from Sample2 interface
        System.out.println("Method 4");
    }
    @Override
    public void method1() { // from Sample1 interface after inherit
        System.out.println("Method 1");
    }
    @Override
    public void method2() { // from Sample1 interface after inherit
        System.out.println("Method 2");
    }
}
// interface can't implements another interface but class can
public class Inheritance_interfaces {
    public static void main(String[] args) {
        SampleClass obj = new SampleClass();
        obj.method1();
    }
}