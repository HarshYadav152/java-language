import java.util.Scanner;

public class Practice_set_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of v : ");
        float v = input.nextFloat();
        System.out.print("Enter the value of u : ");
        float u = input.nextFloat();
        System.out.print("Enter the value of a : ");
        float a = input.nextFloat();
        System.out.print("Enter the value of s : ");
        float s = input.nextFloat();

        float value = ((v*v) - (u*u))/(2*a*s);
        System.out.print("answer : " + value);
    }
}
