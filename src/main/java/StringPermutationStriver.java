package src.main.java;

import java.util.ArrayList;
import java.util.List;

public class StringPermutationStriver {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        List<Integer> result = new ArrayList<>();
        boolean[] frequency = new boolean[arr.length];
        permute(arr, result, frequency);
    }

    private static void permute(int[] arr, List<Integer> result, boolean[] frequency) {

        if(result.size() == arr.length){
            System.out.println(result);
            return;
        }

        for(int i=0;i<arr.length;i++){
            if(!frequency[i]){
                frequency[i] = true;
                result.add(arr[i]);

                permute(arr, result, frequency);
                frequency[i] = false;
                result.remove(result.size() - 1);

            }
        }
    }
}
