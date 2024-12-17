package src.main.java;

import java.util.Arrays;

public class StringSplit {

    public static void main(String[] args) {


        String str = "a good   example";
        String[] strArray = str.split(" ");

        System.out.println(Arrays.toString(strArray));
    }
}
