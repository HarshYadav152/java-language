package OOPs;
public class Method_overloading {
    //static method share by all object ( so we don't want to call it with object name instead we call it by method name )
    // void return type --> use when nothing for return
//    static void hello(){
//        System.out.print("Hello world\n");
//    }
//    static void change(int a){
//        a = 7;
//    }static void changearray(int [] arr){ // here array object is passed
//        // means the address of the element stored in the array
//        arr[0] = 152;
//    }

    // Method overloading --> same method name with different no. of parameter
    static void hello(){
        System.out.println("Hello");
    }
    static void hello(int a){
        System.out.println("Hello "+ a);
    }
    static void hello(int a,int b){
        System.out.println("Hello "+ a + b);
    }
    public static void main(String[] args) {
//        hello();// void return type

        // method change() change the value of passing parameter but it can't
//        int x = 3;
//        change(x);
//        System.out.println(x); // not change value if x
        // in case of array it change because here with array reference is passed
//        int[] arr = {1,2,3};
//        System.out.println(arr[0]);
//        changearray(arr);
//        System.out.println(arr[0]); // it will change the value in the array

        // example of method overloading
        // method overloading cant be done with changing return type
        hello();
        hello(2);
        hello(3,5);
        // Arguments are Actual
    }
}
