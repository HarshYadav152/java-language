public class Methods{
    // there are methods in java like other lang.
    // these are function which is used to do specific work again and again
    // we define a method and call it anywhere in the code it replace the call with the method defination

//     below a method definition which sum of two values
//    datatype method_name(arguments){
//      method body
//    }
    static int sum(int a, int b){
        int sum = a + b;
        return sum;
    }
    // making static means it will be accessible to the all class methods without creating class object
    // hence forth we use this in any other method of the Methods class
    // also static methods only be called by the static method
    // if we don't make this as static which means we have to create a object for using this
    // with static keyword particular method associated with the class not with object
    // while without static keyword it will associated with object

    // below a non static method
    int diff(int a,int b){
        int diff = a-b;
        a = 12;
        return diff; // it id the return type of the method
    }
    // if we have to use this inside the main method we have to create a object for Methods class
    public static void main(String[] args) {
        // method invocation using method name() for static method
        // it is called call by value
        System.out.println(sum(2,4));

        // method invocation using object creation for non static method
        Methods obj = new Methods();
        int diff = obj.diff(3,1); // this is the way to use non static method
        System.out.println(diff);

    }
}
