package Exceptions_and_Error;

import java.util.concurrent.ExecutionException;

class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius can't be negative";
    }

    @Override
    public String getMessage() {
        return "Radius can't be negative";
    }
}
public class Throw_and_Throws {
    public static double area(float r) throws NegativeRadiusException{
        if (r<0){
            throw new NegativeRadiusException();
        }
        return 3.14*r*r;
    }
    public static int divide(int a,int b) throws ArithmeticException{ // give a type of warning it might be give exception
        // it must be handled when use this method
        return a/b;
    }
    public static void main(String[] args) {
        try {
            System.out.println(divide(2,0)); // give an error arithmatic
        }catch (Exception e){
            System.out.println(e);
        }

        try{
            System.out.println(area(-2));// we must include this in a try catch block for handled exception
        }catch (Exception e){
            System.out.println("area exception occured");
        }finally { // it will execute even it placed after return statement ( also after break; and continue;)
            System.out.println("It will run whenever exception occured or not");
            System.out.println("It is often use to release resources and close a connection");
        }
        System.out.println("he");
    }
    // throw --> throw exception
    // throws --> warning to the person who use this method

    // there is a finally like catch which is run every time whether exception occured

}
