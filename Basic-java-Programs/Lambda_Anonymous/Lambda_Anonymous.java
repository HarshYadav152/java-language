package Lambda_Anonymous;

interface Hello{
    void one(int number);
}

// we can do this using anonymous class syntax
//class Gi implements Hello{
//    void display(){
//        System.out.println("display");
//    }
//    @Override
//    public void one() {
//        System.out.println("one method");
//    }
//}
public class Lambda_Anonymous {
    public static void main(String[] args) {
        // declare and instiate class
        // thodi der ke liye apna kaam nikalne ke liye
        // this is an anonymous class which means reference of interface
//        Hello obj = new Hello() {
//            @Override
//            public void one() {
//                System.out.println("One method");
//            }
//        };
//        obj.one();

        // Lambda expressions
//        we can implement functional interface using lambda expression without creating new implementing class
        // by this we using lambda
        Hello obj = (number)->{System.out.println("one method using lambda : "+number);};
        obj.one(2); // will print one method
    }
}