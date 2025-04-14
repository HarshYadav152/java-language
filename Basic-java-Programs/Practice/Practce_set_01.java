package Practice;

import java.util.Scanner;

public class Practce_set_01 {
    public static void main(String[] args){
        System.out.println("CBSE percentage calculator : ");

        Scanner input = new Scanner(System.in); // creating input object for taking input
        System.out.print("Enter the maximum marks : ");
        float maxmarks = input.nextInt();

        System.out.println("Enter the marks obtained : ");
        System.out.print("English marks : ");
        float Emarks = input.nextFloat();
        System.out.print("Hindi marks : ");
        float Hmarks = input.nextFloat();
        System.out.print("Mathematics marks : ");
        float Mmarks = input.nextFloat();
        System.out.print("Science marks : ");
        float Smarks = input.nextFloat();
        System.out.print("SST marks : ");
        float SStmarks = input.nextFloat();

        float totalMarksObtained = Emarks + Hmarks + Mmarks + Smarks + SStmarks;
        float totalMaximumMarks = maxmarks * 5;

        float percentage = (totalMarksObtained/totalMaximumMarks)*100;

        System.out.print("Percentage from the given marks : " + percentage);

    }
}
