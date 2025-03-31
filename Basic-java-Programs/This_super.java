class demo{
    private int x;
    demo(){
        System.out.println("Default demo const");// called by super()
    }
    demo(int x){
        this.x = x; // here left x is also from int x parameter not the data member
        // for associate this with the class we use this
    }
    public int getX(){
        return x;
    }
}

class demo2 extends demo{
    private int y;
    demo2(int y){
        // super this the reference variable to reference immediate parent class instance variable , member function , or parent constructor
        super();
        this.y = y; // here left x is also from int x parameter not the data member
        // for associate this with the class we use this

        System.out.println("demo2 constructor");
    }
    public int getX(){
        return y;
    }
}
public class This_super {
    public static void main(String[] args) {
        demo2 obj = new demo2(3);
        System.out.println(obj.getX());
    }
}
