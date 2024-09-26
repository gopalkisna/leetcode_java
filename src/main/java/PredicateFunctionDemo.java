package src.main.java;

import java.util.function.Predicate;

public class PredicateFunctionDemo {
    public static void main(String[] args) {
       // System.out.println("Hello world!");

        Predicate<String> checkLength = s -> s.length() >= 5;

        System.out.println("Length of the string is : "+checkLength.test("India India"));

        Predicate<String> checkEvenLength = s -> s.length() % 2 == 0;

        System.out.println("Predicate joining with or condition: "+checkLength.and(checkEvenLength).test("Gopal"));


    }
}