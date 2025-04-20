package Collections_Framework.Common;

import java.util.ArrayDeque;

public class ArrayDequeue_Demo {
    public static void main(String[] args) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.add(2);
        queue.add(0);
        queue.addFirst(123); // add 123 at 1st position

        System.out.println(queue.getFirst()); // .getFirst() give element from 1st position
        System.out.println(queue.getLast()); // .getLast() give element from last position
    }
}
