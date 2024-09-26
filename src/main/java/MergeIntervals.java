package src.main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

    public static void main(String[] args) {


        int[][] intervals = {{1,6}, {1,6}, {8,14}};
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));
        List<int[]> result = new ArrayList<>();

        int[] newInterval = intervals[0];
        result.add(newInterval);

        for(int[] interval : intervals){
            if(interval[0] <= newInterval[1]){
                newInterval[1] = Math.max(interval[1], newInterval[1]);
            }else{
                newInterval = interval;
                result.add(newInterval);
            }
        }

        //System.out.println("Result : "+ Arrays.deepToString(result.toArray(new int[result.size()][])));

        for(int[] a : result){
            System.out.println(Arrays.toString(a));
        }

    }
}
