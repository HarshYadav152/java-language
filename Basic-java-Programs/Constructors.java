class DemoCons{
//    member function with name same as without no return type
    // it invoked automatically when we create an object of that class we dont want to tell it explicitly to run

    public DemoCons(){
        System.out.println("This is default constructor invoked successfuly when object created.");
    }
    // constructor overloading also happen using different no. of arguments
    public DemoCons(int a){
        System.out.println("This is parameterized constructor with "+a);
    }
}
public class Constructors {
    public static void main(String[] args) {
        DemoCons obj = new DemoCons();
        DemoCons obj2 = new DemoCons(2);
    }
}
