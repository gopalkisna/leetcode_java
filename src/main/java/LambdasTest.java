package src.main.java;

@FunctionalInterface
interface Greet{
    void display(String text);
}

public class LambdasTest {

    public static void main(String[] args) {

        Greet greet = (text) -> {
            System.out.println("Hello --> "+text);
        };

        greet.display("Gopal");
    }
}
