class One{
    public void gm(){
        System.out.println("Good Morning");
    }
    public void name(){
        System.out.println("My name is HY in ONE");
    }
}
class Two extends One{
    @Override
    public void name(){
        System.out.println("My name is HY in TWO");
    }
    public void gn(){
        System.out.println("Good Night");
    }
}
public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
//        One obj = new One();
//        obj.gm();
//        obj.name();

        // Dynamic Method Dispatch is ( run time polymorphism )
        One obj;
        obj = new Two(); // this will not give error
        obj.gm();
        obj.name(); // it will run for object of class TWO
//        obj.gn(); // it is incorrect // because it is type of One but the object is Two
        // because obj is the reference of super class One while it referencing subclass Two
    // wrong    Two obj2 = new One(); // this is wrong
//      super class ka reference kisi bhi subclass ke object ke bararabar ho sakta hai
    }
}
