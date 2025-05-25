package src.main.java;

import java.util.Arrays;

public class ZeroTransformation {

    public static void main(String[] args) {


        int[] nums = new int[]{1,0,1, 4, 5};
        int[][] queries = new int[][]{{1,3}};

        for(int[] query : queries){
            for(int i=query[0];i<=query[1];i++){
                nums[i] = nums[i] - 1;
            }

        }

        //Arrays.stream(nums).forEach(n -> System.out::println);
        for (int num : nums) {
            System.out.println(num);
        }
    }

}
