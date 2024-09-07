package examples.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(1);
        arrayList.add(23);

        arrayList.add(12);
        arrayList.add(19);

        arrayList.add(2, 5);

        arrayList.remove(2);

        arrayList.forEach(element-> {
            System.out.println("ELEMENT: "+element);
        });

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(23);

        linkedList.add(12);
        linkedList.add(19);

        linkedList.add(2, 5);

        linkedList.remove(2);

        linkedList.forEach(element-> {
            System.out.println("LINKED LIST ELEMENT: "+element);
        });
    }
}
