package src.main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayDifference {

    public static void main(String[] args) {

        int[] nums1 = {1,2,3,3};
        int[] nums2 = {1,1,2,2};


        List<List<Integer>> result = new ArrayList<>();
        List<Integer> nums1Diff = new ArrayList<>();
        List<Integer> nums2Diff = new ArrayList<>();

        Set<Integer> nums1Set = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> nums2Set = Arrays.stream(nums2).boxed().collect(Collectors.toSet());


        for(int n:nums1){
            boolean checkAvailability = nums2Set.contains(n);
            if(!checkAvailability){
                nums1Diff.add(n);
            }
        }

        for(int n:nums2){
            if(!nums1Set.contains(n)){
                nums2Diff.add(n);
            }
        }

        result.add(nums1Diff);
        result.add(nums2Diff);
        System.out.println(result);
    }
}
