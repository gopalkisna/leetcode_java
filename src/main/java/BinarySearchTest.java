package src.main.java;

public class BinarySearchTest {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};

        int low=0;
        int high = array.length-1;
        int target = 40;

        while(low <= high){

            int mid = low + (high - low) / 2;

            if(array[mid] == target){
                System.out.println("Found Element");
                return;
            }

            if(target < array[mid]){
                high = mid-1;
            }else{
                low=mid+1;
            }
        }

    }
}
