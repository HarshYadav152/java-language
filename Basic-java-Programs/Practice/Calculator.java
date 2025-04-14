package calculator;

class Basic{
    public void add(){
        System.out.println("Basic Calculator");
    }
}
class Scientific{
    public void log(){
        System.out.println("Scientific Calculator");
    }
}
public class Calculator {
    public static void main(String[] args) {
        Basic obj1 = new Basic();
        obj1.add();
        Scientific obj2 = new Scientific();
        obj2.log();
    }
}
