package src.main.java.slidingwindow;

public class LargestSubArrayK {

    public static void main(String[] args) {

        int[] arr = new int[]{2, 3, 4, 5, 7, 8};
        int sum = 14;

        int l=0;
        int r=0;
        int maxLength = 0;
        int windowSum = 0;

        while(r < arr.length){


            windowSum = windowSum + arr[r];
            if(windowSum <= sum){
               maxLength = Math.max(maxLength, r-l+1);
            }else{
                windowSum = windowSum - arr[l];
                l++;
            }
            r++;
        }

        System.out.println(maxLength);
    }
}
