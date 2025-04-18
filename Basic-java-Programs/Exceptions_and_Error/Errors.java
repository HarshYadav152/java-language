package Exceptions_and_Error;

import java.util.Scanner;

public class Errors {
    public static void main(String[] args) {
        // this is error it can't be handled (syntax error)
        int c = 3; // without ; it give syntax error
//        b = 2; b not declare syntax error
        System.out.println(c);

        // logical error or bugs
        // not a error this is an mistake which give unpredicable output
        int a = 2+2; // there is no error but actually we want 2-2 so it is logical error

        // runtime error occur when program running
        // some wrong inputs like number/0 --> this is not a error this is exception error aa sakta hai hamesha 0 nahi hoga inout

        // runtime error
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println(2+k); // if we give number to k this run correctly
        // if we give character this is give exception
        // give an arithmetic exception

    }
}
