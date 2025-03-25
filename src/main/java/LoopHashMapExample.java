package src.main.java;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoopHashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("cherry", 3);

        // Using entrySet() with enhanced for-loop
     /*   for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }*/

        map.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .forEach(entry -> System.out.println(entry.getKey()));

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        list.stream()
                .filter(integer -> integer.equals(10))
                .forEach(System.out::println);
    }
}

