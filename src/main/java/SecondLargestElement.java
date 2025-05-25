package src.main.java;

import java.util.Arrays;

public class SecondLargestElement {

    public static void main(String[] args) {

        int[] array = {2, 3, 4, 5, 7};

        Arrays.sort(array);

        System.out.println("Largest Element in the array : " + array[array.length - 1]);
    }
}
