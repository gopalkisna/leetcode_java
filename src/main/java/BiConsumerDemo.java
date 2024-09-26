package src.main.java;

import java.util.function.BiConsumer;

public class BiConsumerDemo {

    public static void main(String[] args) {

        BiConsumer<Integer, Integer> biConsumer = (a,b) -> System.out.print(a+b);
        biConsumer.accept(5,5);
    }
}
