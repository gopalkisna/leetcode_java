package src.main.java;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeQueueTest {

    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();

        dq.addFirst(12);
        // dq.addFirst(null);
        dq.addLast(16);
        System.out.println(dq);
    }
}
