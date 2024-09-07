package examples.collections;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(23);
        set.add(12);
        set.add(19);

        set.forEach(element-> {
            System.out.println("ELEMENT: "+element);
        });

        SortedSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(1);
        treeSet.add(23);
        treeSet.add(12);
        treeSet.add(19);

        treeSet.forEach(element-> {
            System.out.println("SORTED ELEMENT: "+element);
        });
    }
}
