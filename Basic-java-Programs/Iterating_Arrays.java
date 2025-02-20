public class Iterating_Arrays {
    public static void main(String[] args){
        System.out.println("Iterating array using foreach look");

        int[] marks = {1,2,3};
        System.out.println(marks[0]);
        System.out.print("Length of the array : ");
        System.out.println(marks.length);

        // we can iterating array with normal for loop
        // Array Traversal
        // but here we use foreach loop
        for(int element : marks){
            // it give the element of the array
            System.out.println(element);
        }
    }
}
