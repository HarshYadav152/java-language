package Strings;
public class Strings_methods {
    public static void main(String[] args){
        System.out.println("Strings Methods : ");

        String name = "Vijay Salgaonkar";
        System.out.println(name);
//        System.out.printf("\nLength of the name is : %s",name.length()); // count length of the string
//
//        String lname = name.toLowerCase(); // it return the new string not alter the original string
//        System.out.printf("\nConvert the string to lowercase is %s",lname);
//
//        String uname = name.toUpperCase(); // it return the new string not alter the original string
//        System.out.printf("\nConvert the string to uppercase is %s",uname);
//
//        String string = "    George Kutti       ";
//        System.out.format("\nBefore Trim spaces : %s",string);
//        System.out.format("\nThis will trim the leading and trailing spaces : %s",string.trim());// trim spaces

        // this will return the substring the string from the given index
        System.out.println(name.substring(3)); // it will print the remaining string from index 3
//        System.out.println(name.substring(0)); // it will return the remaining from index from 0 which is equal to original string
        // we also specify the start(included) index to end index(exluded)
        System.out.println(name.substring(2,9)); // it print till index 2 to index 9-1

        // it will replace character from the string and return the new string
        System.out.println(name.replace("Vi","pp")); // in the string name it replace V with P all occurance

        // also we can find in the string wheather startwith or endswith given string or character
        System.out.println(name.startsWith("Vi"));// return true if start with Vi
        System.out.println(name.endsWith("V"));// return true if ends with V

        // find the character at the given index
        System.out.println(name.charAt(2)); // return j in Vijay Salgaonkar

        // return the index of the specfied character
//        System.out.println(name.indexOf("y"));
//        System.out.println(name.indexOf("ay")); // return the index of the first occurence

        String aa = "HarryHarry";
        // if give -1 means not found
        System.out.println(aa.indexOf("y",5));// find the index of the y in the string but starting index is 5

        // if i want to fint the index from the last there is a another method
//        System.out.println(aa.lastIndexOf("ar"));// last character at the index 3
//        System.out.println(aa.lastIndexOf("ar",4));// last character at the index 3 after 4th index

        System.out.println(name.equals("Harsh"));// return true if both string is equals to other or not ( it is case sensitive )
        System.out.println(name.equalsIgnoreCase("vijay salgaonkar")); // same as .equals() but it ignore case sensitive

        // Escape Sequence character start with \
//        \n --> newline
//        \" --> "
//        \\ --> \
//        \t --> tab
        System.out.println("new\nline\ttab\"double quote\\backslash etc ");
    }
}
