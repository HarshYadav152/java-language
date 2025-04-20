package Collections_Framework.Common;

import java.util.LinkedList;
public class LinkedList_Demo {
    public static void main(String[] args) {
        // Generic class syntax
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list2.add(11);
        list2.add(12);
        list2.add(13);
        // we can also add list2 to the list  using addAll() method
        list.addAll(0,list2); // at index 0
        list.add(1,9990); // put the element 9990 at index 1

//        list.clear(); // delete all element

        list.addLast(23); // add this element at last position in the linkedlist

        for (int i = 0; i < list.size();i++){  // .size() is used for determining size of the array list
            System.out.println(list.get(i)); // .get for getting element at ith index from the arrayList
        }
    }
}
