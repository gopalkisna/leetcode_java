package src.main.java;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {
        Function<Integer, Integer> transform = i -> i * i;

        System.out.println(transform.apply(5));

    }
}
