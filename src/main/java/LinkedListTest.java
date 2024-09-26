package src.main.java;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {

        Deque<Integer> queue = new LinkedList<>();

        queue.addFirst(12);
        queue.addFirst(13);
        queue.addLast(14);
        queue.addLast(13);

        System.out.println(queue);
        System.out.println(queue.peek());
    }
}
