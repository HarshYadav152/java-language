package Collections_Framework.Common;

import java.util.HashSet;

public class HashSet_Demo {
    public static void main(String[] args) {
        HashSet<Integer> myHash = new HashSet<>(); // default initial capacity is 16 with load factore is 0.75
        HashSet<Integer> myHash1 = new HashSet<>(5,0.3f);
        myHash.add(2);
        myHash.add(5);
        myHash.add(5); // it will added only once
        System.out.println(myHash);
        System.out.println(myHash.contains(99));
    }
}
