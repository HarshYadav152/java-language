

import java.util.Scanner;

public class Practice_set_03 {
    public static void main(String[] args) {
//        String name = "PS";
//        System.out.println(name.toLowerCase());
//
//        String string = "P S sen";
//        System.out.printf("Replace black space with _ in %s : %s\n",string,string.replace(" ","_"));
//
//        String letter = "Dear <|name|> Thanks a lot";
//        Scanner input = new Scanner(System.in);
//        String fname = input.nextLine();
//        System.out.printf("\nLetter : %s",letter.replace("<|name|>",fname));

        String lname = "hello  Name  what is this";
        System.out.printf("Detect double blank space : %d\n",lname.indexOf("  ")); // if -1 means space not present otherwise
        System.out.printf("Detect triple blank space : %d",lname.indexOf("   ")); // if -1 means space not present otherwise positive number
    }
}
