package src.main.java;// Java Program to illustrate ConcurrentModificationException
// Using Normal Collections

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


// Main class extending Thread class
class GFG extends Thread {

    // Creating a static HashMap class object
    static HashMap m = new HashMap();

    // run() method for the thread
    public void run()
    {

        // Try block to check for exceptions
        try {

            // Making thread to sleep for 3 seconds
            Thread.sleep(2000);
        }

        // Catch block to handle exceptions
        catch (InterruptedException e) {
        }

        // Display message
        System.out.println("Child Thread updating Map");

        // Putting element in map
        m.put(103, "C");
    }

    // Method 2
    // Main driver method
    public static void main(String arg[])
            throws InterruptedException
    {

        // Adding elements to map object created above
        // using put() method
        m.put(101, "A");
        m.put(102, "B");

        // Creating thread inside main() method
        GFG t = new GFG();

        // Starting the thread
        t.start();

        // Operating keySet() method and
        // storing it in Set class object
        Set s1 = m.keySet();

        // Iterating over Set class object
        // using iterators
        Iterator itr = s1.iterator();

        // Holds true till there is single element present
        // inside object
        while (itr.hasNext()) {

            // traversing over elements in object
            // using next() method
            Integer I1 = (Integer)itr.next();

            // Print statement
            System.out.println(
                    "Main Thread Iterating Map and Current Entry is:"
                            + I1 + "..." + m.get(I1));

            // Making thread to sleep for 3 seconds
            Thread.sleep(3000);
        }

        // Printing all elements on console
        System.out.println(m);
    }
}
