package Arrays;
public class Array {
    public static void main(String[] args) {
        System.out.println("Array in java");
        // Array is a collection of same datatype
        // collection of integers and character and string and floats and double
        // store in contigious allocation
        int [] marks = new int[5]; // memory allocate for 5 student

        // this is the initialization
        marks[0] = 100;
        marks[1] = 16;
        marks[2] = 56;
        marks[3] = 90;
        marks[4] = 45;

        // accessed by index start with 0
        for(int i = 0;i < marks.length;i++){
            System.out.print(marks[i]);
            System.out.print("\n");
        }
        // also we can re allocate element 
        System.out.println(marks[2]);
        marks[2] = 8;
        System.out.println(marks[2]);
        

        // method of declare array
        int [] student; // Declaration 
        student = new int[1]; // memory allocation

        int [] marks1 = new int[1]; // Declaration + memory allocation

        int[] stu1 = {1,2}; // Declaration and initialize and memory allocation together
        System.out.println(stu1[1]);
        // indices goes from 0 to n-1 where n is the total size of the array
    }
}
