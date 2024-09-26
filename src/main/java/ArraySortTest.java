package src.main.java;

import java.util.Arrays;

public class ArraySortTest {

    public static void main(String[] args) {


        int[][] arr = {{1,5}, {3,4}, {7,9}, {2, 3}};

        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        System.out.println(arr.length);

        System.out.println(arr[0].length);

        for (int i = 0; i < arr.length; i++) {
            System.out.print("{ ");
            int j = 0;
            for (; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("}");
            System.out.print(",");
        }

    }
}
