package Generics;

import java.util.ArrayList;
import java.util.Scanner;

// can have multiple generic type
class Generic<Type1>{
    int value;
    private Type1 value2;

    public Generic(int value,Type1 value2) {
        this.value2 = value2;
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    public Type1 getValue2() {
        return value2;
    }
}

public class Generics_Demo {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("abc");
        arrayList.add(12);
        arrayList.add(12.3);
        arrayList.add(new Scanner(System.in));

        // if we try to get element
        // int z = arrayList.get(1); // it should return 12 but it will give error of incompatible type
        // because we use different objects in same ArrayList so java can't determine which type of value this except for this we use
        // type casting
        int z = (int) arrayList.get(1); // this will give correct value
        System.out.println(z);

        // now using Generic syntax we supply datatype of value we add in future
        ArrayList<Float> arrayList1 = new ArrayList();
//        ArrayList<float> arrayList1 = new ArrayList(); // it will give an error float is different from Float
        arrayList1.add(23.5f); // now it will only take float and we don't need to typecasting this

        float a = arrayList1.get(0);
        System.out.println(a);

        // Generic class
        Generic<String> g1 = new Generic(99,"Hello"); // here we pass any type of datatype in place of <> like here i provide String i also use int of float
        System.out.println(g1.getValue());
        System.out.println(g1.getValue2());
    }
}
