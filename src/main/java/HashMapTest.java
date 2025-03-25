package src.main.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapTest extends Thread{

    static private Map<Integer, Integer> map = new HashMap<>();

    public void run(){


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        map.put(111, 111);

    }


    public static void main(String[] args) throws InterruptedException {

        map.put(222, 111);
        map.put(999, 111);


        ConcurrentHashMap<String, Integer> cmap = new ConcurrentHashMap<>();

        cmap.put("First", 10);
        cmap.put("Second", 20);
        cmap.put("Third", 30);
        cmap.put("Fourth", 40);

        Iterator<String> iterator = cmap.keySet().iterator();

        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key);
            cmap.put("Fifth", 50);
        }

        for(Map.Entry<Integer, Integer> entry:map.entrySet()){

            System.out.println(entry.getKey());
            map.put(12333, 6888);

        }

        HashMapTest thread = new HashMapTest();
        thread.start();

        Set s1 = map.keySet();

        // Holds true till there is single element present
        // inside object
        for (Object o : s1) {

            // traversing over elements in object
            // using next() method
            Integer I1 = (Integer) o;

            // Print statement
            System.out.println(
                    "Main Thread Iterating Map and Current Entry is:"
                            + I1 + "..." + map.get(I1));

            // Making thread to sleep for 3 seconds
            Thread.sleep(1000);
        }

        System.out.println(map);
    }
}