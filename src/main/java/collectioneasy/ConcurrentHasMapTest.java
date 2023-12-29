package main.java.collectioneasy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHasMapTest {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        //This will throw ConcurrentModificationException because HashMap is not Thread safe
        removeFromMap(map);
        // And this does not throw
        Map<Integer, String> mapC = new ConcurrentHashMap<>();
        removeFromMap(mapC);
    }

    private static void removeFromMap(Map<Integer, String> map) {
        map.put(1, "one");
        map.put(2, "two");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() == 1) {
                map.remove(1);
            }
        }
    }
}
