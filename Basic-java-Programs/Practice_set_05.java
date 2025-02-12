import java.util.Scanner;

public class Practice_set_05 {
    public static void main(String[] args) {
        // first
        // for (int i = 5; i > 0; i--) {
        //     for (int j = 0; j < i; j++) {
        //         System.out.print("*");
        //     }
        //     // System.out.print("*");
        //     System.out.println("\n");
        // }

        // second
        // int sum = 0;
        Scanner input = new Scanner(System.in);
        // System.out.print("Enter the value of n : ");
        // int n = input.nextInt();
        // int nn = n;

        // while (n > 0) {
        //     if (n % 2 == 0){
        //         sum += n;
        //     } 
        //     n--;
        // }
        // System.out.printf("Sum of %d even numbers is %d.",nn,sum);

        // third
        // System.out.print("Enter the number for multiplication table : ");
        // int n = input.nextInt();
        
        // for(int i = 1;i < 11; i++){
        //     System.out.printf("%d X %d  = %d\n",n,i,n*i);
        // }


        // four
        // System.out.print("Enter the number for reverse multiplication table : ");
        // int n = input.nextInt();
        
        // for(int i = 10;i >= 1; i--){
        //     System.out.printf("%d X %d  = %d\n",n,i,n*i);
        // }

        // factorial
        System.out.print("Enter the number for finding factorial : ");
        int num = input.nextInt();
        int n = num;
        int factorial = 1;
        
        while (num > 0) {
            factorial *= num;
            num--;
        }

        System.out.format("Factorial of %s is %d",n,factorial);
    }
}
