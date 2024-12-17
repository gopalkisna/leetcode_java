package src.main.java.slidingwindow;

public class MaxSumSizeK {

    public static void main(String[] args) {


        int[] arr = new int[]{2, 3, 4, 5, 7, 8};
        int k = 4;

        System.out.println(kMaxSum(arr, k));
    }

    private static int kMaxSum(int[] arr, int k) {

        int sum = 0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }

        int windowSum = sum;

        for(int i=k;i< arr.length;i++){

            windowSum = windowSum - arr[i-k];
            windowSum = windowSum + arr[i];

            sum = Math.max(sum, windowSum);
        }

        return sum;

    }
}
