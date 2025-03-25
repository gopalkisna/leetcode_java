package src.main.java;

import java.util.HashMap;
import java.util.Map;

class LRUCache{

    int capacity;
    Map<Integer, Node> map;
    Node head;
    Node tail;

    LRUCache(int capacity){
        this.capacity = capacity;
        map = new HashMap<>(capacity);
        head = new Node(0, 0, null, null);
        tail = new Node(0, 0, null, null);

        head.next = tail;
        tail.prev = head;
    }

    public void put(int k, int v){
        if(map.get(k) == null){
            Node newNode = createNode(k, v);
            attachNodeToHead(newNode);
            map.put(k, newNode);
        }else{
            //remove last node if we reached the capacity
            Node newNode = createNode(k, v);
            attachNodeToHead(newNode);
            map.put(k, newNode);
        }
    }

    private void attachNodeToHead(Node newNode) {

        if(map.isEmpty()){
            head.next = newNode;
            newNode.prev = head;
            newNode.next = tail;
            tail.prev = newNode;
        }else{
            Node curFirstNode = head.next;
            head.next = newNode;
            newNode.next = curFirstNode;
            curFirstNode.prev = newNode;
        }
    }

    void printList(){

        Node temp = head.next;
        while(temp != null && temp != tail){
            System.out.println("Key :" + temp.key + "   Value :" + temp.value);
            temp = temp.next;
        }
    }

    private Node createNode(int k, int v) {
        return new Node(k, v, null, null);
    }

    static class Node{

        int key;
        int value;
        Node next, prev;

        public Node(int k, int v, Node next, Node prev) {
            this.key = k;
            this.value = v;
            this.next = next;
            this.prev = prev;
        }
    }
}

public class CacheClient {

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(4);

        lruCache.put(111, 222);
        lruCache.put(333, 444);
        lruCache.put(555, 666);

        lruCache.printList();

    }
}
