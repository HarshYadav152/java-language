package Annotations;

// functional interface is a abstract interface which have only one abstract method
@FunctionalInterface
interface myFunctionalInterface{
    void thisMethod();
    // if i dont use @FunctionalInterface so i can implement more than one method by mistake
}

abstract class questions{
    abstract void one(); // now this must be overriden in inherit class
}

class answer extends questions{
    // override likha hai toh override karna padega
    @Override // this tells the method is override
    public void one(){
        System.out.println("One");
    }

    @Deprecated
    void sum(int a,int b){
        System.out.println(a+b);
    }
}
public class Annotations {
    public static void main(String[] args) {
        // in java there are several annotations which provide additional information about the program
        // start with @ symbol
        // it is like metadata

        // @supresswarning // for supress the warning for deprecated method or anything
        answer ob = new answer();
        ob.sum(2,3);

        // there are many annotations
    }
}
