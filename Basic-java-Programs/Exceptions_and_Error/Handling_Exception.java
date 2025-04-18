package Exceptions_and_Error;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Handling_Exception {
    public static void main(String[] args) {
        int k;
        Scanner sc = new Scanner(System.in);
        // for unchecked exception
        try{
        k = sc.nextInt();
        System.out.println(k+1); // there is an exception which can be handled using try catch block
        // we wrap our block of code which could raise exception
        }catch(InputMismatchException e){
            System.out.println("Hello");
        }
        // we can use different exception using different catch statement
        catch (Exception e){ // handle all exception
            System.out.println("Exception occured "+e); // using this program nt red it runs while handling exception
        }finally { // it will execute even exception occured or not
            System.out.println("Hello this run everytime");
        }

        System.out.println("***********************************************8888");
        // also we can use nested try catch
        int [] mark = new int[3];
        mark[0] = 7;
        try{
            System.out.println("Handle exception");
            // this is the nested try catch block
            try{
                System.out.println(mark[9]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Array index out of range");
            }
        }
        catch (Exception e){
            System.out.println("Exception khatam");
        }
    }
}
