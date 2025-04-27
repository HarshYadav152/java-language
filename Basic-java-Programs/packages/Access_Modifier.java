package packages;

class C1{
    public int x = 3;
    protected int y = 3;
    int z =23;
    private int a = 123;

    public void meth1(){ // it can access all these because it is method within same class
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
class C2 extends C1{
    public void meth2(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
//        System.out.println(a); // not available in subclass
    }
}
public class Access_Modifier {
    public static void main(String[] args) {
//        C1 obj = new C1();
//        obj.meth1();
//        {
//            // also these can be accessed in the same package
//            System.out.println(obj.x);
//            System.out.println(obj.y);
//            System.out.println(obj.z);
//            System.out.println(obj.a); // but private not
//        }

//        C2 obj2 = new C2();
//        obj2.meth2();

    }
    public void hello(){
        C2 obj2 = new C2();
        obj2.meth2();
    }
}
