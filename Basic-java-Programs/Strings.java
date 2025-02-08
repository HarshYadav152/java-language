import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {

        // while String is a class so we have to create a new object each time to use string: but we can use it as datatype of like other primitive datatype
        // eg : char name = 'w';
        // String name;
        // name = new String("Harsh");

        String name = "Harsh";
        // these are immutable
        System.out.print("The name is : ");
        System.out.println(name);

        // for float value we use precision
        float num = 3.2455f;
        System.out.printf("The value of float with 2 precision : %.2f\n",num); // for decimal precision
        System.out.printf("The value of float with 2 precision : %9.2f",num); // for tatal space covered by the number shown

        int a = 4;
        char ch = 'e';
        System.out.printf("%d\n",a);
        System.out.printf("%s\n",name);// ek aur similar hai
        System.out.format("%c\n",ch);

        Scanner input = new Scanner(System.in);
//        String sname = input.next(); // .next() only take entered string till space after space it can't take
//        System.out.format("This is string with next() : %s\n",sname);
        String oname = input.nextLine(); // for full length of string
        System.out.format("This is string with nextLine() : %s",oname);

    }
}
