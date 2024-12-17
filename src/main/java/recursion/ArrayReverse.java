package src.main.java.recursion;

import java.util.Arrays;

public class ArrayReverse {

    public static void main(String[] args) {

        int[] array = new int[]{5, 4, 3, 2, 1};
        System.out.println("Before Reverse " +Arrays.toString(array));

        swap(array, 0, array.length - 1);
        System.out.println("After Reverse " +Arrays.toString(array));


    }

    private static void swap(int[] array, int l, int r) {

        if(l == r){
            return;
        }

        int temp;
        temp=array[l];
        array[l] = array[r];
        array[r] = temp;

        swap(array, l + 1, r - 1);
    }
}
