public class Operators {
    public static void main(String[] args){
        // like others language java also have operators

        // Arithmetic Operator
        // + , -, *, /, %, ++, --

        int a = 2;
        int b = 5;
        int c = b%a; // % give the remainder
//        System.out.println(c);
        System.out.println(4.8%1.1);
        // Assignment Operator
        // =, +=
        c += 3; // increase value of c by 3
//        System.out.println(c);

        // Comparison Operator
        // <, >, =<, =>, ==
        System.out.println(3==3);// give
        System.out.println(3>4); // false

        // Logical Operator
        // &&, ||, !
        System.out.println(false&&true);
        System.out.println(!false);
        System.out.println(23<4 || 34>2);

        // Bitwise Operator
        // &, |
        // doing there work after converting it into binary numbers
        System.out.println(10 | 01);
        System.out.println(2|1);

        // which operator has highest precedence evaluated first and low precedence evaluated after that .
        // if precedence tie on some places associativity take place left-to-right or right-to-left.

        // increment and decrement
        int var = 3;
        var++; // first use before increment // first var is assigned and then incremented
        --var; // first decrement before use
        System.out.println(var);

        // Resulting datatype of the evaluated arithmetic operation
//      int + something --> int
//      float + something --> float
//      double + long & float --> double

    }
}