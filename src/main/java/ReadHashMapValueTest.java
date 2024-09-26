package src.main.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class ReadHashMapValueTest {

    public static void main(String[] args) {
        Map<Integer, String> hashmap = new HashMap<Integer, String>();
        // Adding Key and Value pairs to HashMap
        hashmap.put(22,"A");
        hashmap.put(55,"B");
        hashmap.put(33,"Z");
        hashmap.put(44,"M");
        hashmap.put(99,"I");
        hashmap.put(88,"X");

        Set<String> sortedData = new TreeSet<>();

        for(Map.Entry<Integer, String> map: hashmap.entrySet()){
           // System.out.println(map.getValue());
            sortedData.add(map.getValue());
        }

        System.out.println(sortedData);
    }
}
