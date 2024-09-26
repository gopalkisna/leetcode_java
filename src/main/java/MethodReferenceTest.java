package src.main.java;

import java.util.List;

public class MethodReferenceTest {

    public static void main(String[] args) {


        List<String> list = List.of("Gopal", "Krishna", "Ramu", "   ");


        Boolean b = list.stream().anyMatch(String::isEmpty);

        System.out.println(b);




    }
}
