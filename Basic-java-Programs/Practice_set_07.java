public class Practice_set_07 {

//    static int sum(int a){
    //   this is the base condition
//        if(a == 1){
//            return 1;
//        }
//        return a + sum(a-1);
//    }

    // fibonacci series
    static void fibonacci(int terms){
        int first = 0;
        int second = 1;
        int third = 0;
        for (int i = 0; i < terms; i++) {
            System.out.print(third+" ");
            first = second;
            second = third;
            third = first + second;
        }
    }

    // reverse patterm
    static void pattern(int n){
        for (int i = 0;i < n;i++){
            for (int j = 0; j <= n-i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

//    static int fib(int n){
////        if(n==1){
////            return 0;
////        } else if (n==2) {
////            return 1;
////        }
//        if(n == 1 || n==2){
//            return n-1;
//        }
//        else {
//            return fib(n-1) + fib(n-2);
//        }
//    }

//    pattern in recursive approach
//    static void pat_rec(int n){
//        if(n > 0){
//            pat_rec(n-1);
//            for (int i = 0; i < n; i++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

        // reverse pattern recursion
//            static void pat_rec(int n){
//                    if(n < 0){
//                        for (int i = 0; i < n; i++) {
//                        System.out.print("*");
//                        pat_rec(n+1);
//                    }
//                        System.out.println();
//                    }
//                }
    public static void main(String[] args) {
//        System.out.println(sum(10));
//        System.out.println(sum(2));
//        pattern(5);

//        System.out.println(fib(10)); // it will return the 10 term of the fibonacci series


//         pat_rec(5);
        fibonacci(10);
    }
}
