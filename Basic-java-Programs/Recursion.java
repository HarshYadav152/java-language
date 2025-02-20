public class Recursion {
    static int factorial(int n){
        // iterative approach
        int i = 1;
        while (n > 0){
            i *= n;
            n--;
        }
        return i;

          // Recursive Approach
//        factorial(5) = 5*4*3*2*1;
//        factorial(n) = n * factorial(n-1); for all n >= 1
        // factorial(0) = 1;

//        if(n == 0 || n == 1){
//            return 1;
//        }else{
//            return n * factorial(n-1);
//        }

    }
    public static void main(String[] args){
        System.out.println(factorial(5));
        System.out.println(factorial(0));
    }
}
