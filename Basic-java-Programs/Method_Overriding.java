class MO_b{
    public void give(){
        System.out.println("It will give");
    }
}
class MO_d extends MO_b{
    // below give() method override the inherit method give() from MO_b
    @Override // this is recommended for write to show weather a function is override or not
    public void give(){ // no. of arguments is same also same or sub type of return type
        // with same access modifier
        System.out.println("It is derived class method");
    }

    // method overriding is the re-define the inherit function give() with new implementation
}
public class Method_Overriding {
    public static void main(String[] args) {
        MO_b obj2 = new MO_b();
        obj2.give();
        MO_d obj = new MO_d();
        obj.give();
    }
}
