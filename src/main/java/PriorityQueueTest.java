package src.main.java;

import java.util.PriorityQueue;
import java.util.Queue;


public class PriorityQueueTest {

    public static void main(String[] args) {


        Queue<Integer> queue = new PriorityQueue<>((a,b) -> b-a);

        /*queue.add(12);
        queue.add(13);


        System.out.println(queue);

        System.out.println(queue.peek()); // Just print, no impact to the queue
        System.out.println(queue.poll()); // Remove from the queue
        System.out.println(queue.peek()); // Just print, no impact to the queue
        System.out.println(queue);*/


        int[] arr = {3,2,1,5,6,4};

        for(int a : arr){
            queue.add(a);
        }

        int k=2;
        System.out.println(queue);
        for(int i=0;i<k;i++){
            if(i == k-1){
                System.out.println(queue.peek());
            }else{
                queue.poll();
            }
        }

    }
}
