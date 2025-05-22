package src.main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DaysWithoutMeetings {

    public static void main(String[] args) {

        int days = 10;
        int[][] meetings = {{5,7}, {1,3}, {9,10}};
        Arrays.sort(meetings, Comparator.comparingInt(i -> i[0]));

        System.out.println("Sorted meetings : ");

        for(int[] a : meetings){
            System.out.println(Arrays.toString(a));
        }

        List<int[]> result = new ArrayList<>();

        int[] newInterval = meetings[0];
        result.add(newInterval);

        for(int[] meeting : meetings){

        }
    }
}
