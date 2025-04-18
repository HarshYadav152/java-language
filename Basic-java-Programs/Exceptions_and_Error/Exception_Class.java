package Exceptions_and_Error;

// we can create custom exception using Exception class
class MyException extends Exception{
    @Override
    public String toString() { // we have to override these methods of Exception class
        return " I am toString()";
    }
    @Override
    public String getMessage() { // we have to override these methods of Exception class
        return " I am getMessage()";
    }
}
public class Exception_Class {
    public static void main(String[] args) {
        int a = 8;
        if(a<10){
            try{
//                throw new MyException(); // custom exception throw by throw keyword
                throw new ArithmeticException("This is arithmetic");
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace(); // run after all statement execution with trace all information where exception occur
                System.out.println("Finished");
            }
            System.out.println("Finished2");
        }
    }
}
