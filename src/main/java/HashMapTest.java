package src.main.java;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapTest extends Thread{

    static private Map<Integer, Integer> map = new ConcurrentHashMap<>();

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