package src.main.java;

import java.util.Arrays;
import java.util.List;

public class BoundedGenerics {

    public static void main(String[] args) {


        Double[] doubles = {2.0, 3.5, 14.7};
        Integer[] numbers = {1, 5, 7};

        String[] str = {"abc", "def"};

        List<Double> doublesList = convertArrayToList(doubles);
        List<Integer> integerList = convertArrayToList(numbers);
        List<String> strList = convertArrayToList(str);

        System.out.println(doublesList);
        System.out.println(integerList);
        System.out.println(strList);

    }

    private static List<String> convertArrayToList(String[] str) {
        return Arrays.asList(str);

    }

    private static <T extends Number> List<T> convertArrayToList(T[] array) {

        return Arrays.asList(array);
    }
}
