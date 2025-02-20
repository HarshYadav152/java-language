public class Varagrs {
    // using varargs we can pass multiple arguments to same method
    // without method overload
//    static int sum(int a,int b){
//        return a + b;
//    }

    static int sum(int x,int ...arr){ // it will take multiple arguments as array
        int sum = x;
        for (int a : arr){
            sum += a;
        }
        return  sum;
    }
    public static void main(String[] args) {
        System.out.println("Welcome");
        System.out.println("Sum of 4 and 5 is "+sum(4,5));
        System.out.println("Sum of 4 and 5 is "+sum(4,5,7,8));// now we can pass multiple arguments
//        System.out.println("Nothing "+sum());
    }
}
