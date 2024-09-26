package src.main.java;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class StreamTest {

    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,4,6);

        //List<Integer> list = null;

        //List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        Optional<Integer> result = Objects.requireNonNull(list).stream()
                .filter(n -> n%2 == 0)
                .map(StreamTest::multiplier)
                .findAny();

        /*Optional<Integer> result = list.stream()
                .filter(n -> n%2 == 0)
                .map(n -> n*n)
                .findAny();*/
                //.collect(Collectors.toList());

        System.out.println(result);

       // list.forEach(System.out::println);
    }

    public static Integer multiplier(int n){
        return n*n;
    }
}
