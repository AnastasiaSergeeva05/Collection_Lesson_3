

import java.util.LinkedHashMap;
import java.util.Map;

public class Task2 {
    private static final Map<String, Integer> map = new LinkedHashMap<>();

    public static void main(String[] args) {

        print();
        addKey((LinkedHashMap<String, Integer>) map, "a", 1);
        System.out.println(map);
    }

    public static void print() {
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("cd", 5);
        map.put("f", 6);
        map.put("g", 7);
        map.put("h", 8);
        map.put("i", 7);
        map.put("j", 9);
        for (Map.Entry<String, Integer> integerStringEntry : map.entrySet()) {
            System.out.println(integerStringEntry.getKey() + " : " + integerStringEntry.getValue());
        }
    }

    public static void addKey(LinkedHashMap<String, Integer> map, String key, int value) {

        if (map.get(key) != null && map.get(key) == value) {
            throw new RuntimeException();
        }
        map.put(key, value);
    }
}