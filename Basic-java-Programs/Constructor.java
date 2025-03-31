class SameNameClass{
    // constructor is a member function with name same as parent class without no return value or type
    public SameNameClass(){
        System.out.print("Hello this is default constructor is called when object is created");
    }

//    we often use this for initializing the data members when creating object
    public SameNameClass(int x,int y){ // called parameterized constructor
        int sum = x+y;
        System.out.println(sum);
    }
    // constructor also be overload you can see the example above
}
public class Constructor {
    public static void main(String[] args) {
        SameNameClass object = new SameNameClass(); // it will invoke automatically
        SameNameClass obj = new SameNameClass();
        SameNameClass object1 = new SameNameClass(2,3); // it will work as setter
    }
}
