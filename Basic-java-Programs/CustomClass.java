class Emp{
    int eid;
    String name;

    // member function set Details
    public void setDetails(int id,String str){
        eid = id;
        name = str;
    }
    // member function print Details
    public void printDetails(){
        System.out.println("EmployeeId id "+eid+"\nName is "+name);
    }
}
// we only make public only one class in a one JAVA file
// real world object --->>>  properties         +     behaviour
// object in OOPs --->>>     attributes(member) +     member methods
public class CustomClass {
    public static void main(String[] args) {
        System.out.println("Custom class");

        Emp harsh = new Emp(); // instantiating a new Emp object
        Emp Jon = new Emp(); // instantiating a new Emp object 2nd object
        // setting properties
//        harsh.eid = 10;
//        harsh.name = "Prashant";

        // printing attributes
        Jon.setDetails(12,"Akash");
        Jon.printDetails();
//        harsh.printDetails();
//        System.out.println(harsh.eid);
//        System.out.println(harsh.name);
    }
}
