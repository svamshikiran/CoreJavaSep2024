package examples.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "JAVA");
        map.put(2, "SPRING");
        map.put(3, "SQL");
        map.put(4, "ORACLE");
        map.put(5, "GIT");

        System.out.println("KEY VALUE: "+map.get(2));

        Set<Integer> keySet = map.keySet();

        keySet.forEach(key-> {
            System.out.println("VALUE: "+map.get(key));
        });
    }
}
