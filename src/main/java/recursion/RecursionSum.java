package src.main.java.recursion;

public class RecursionSum {

    public static void main(String[] args) {

        //Sum of first n numbers

        int n = 5;

        System.out.println(sum(n));
    }

    private static int sum(int n) {

        if(n == 0){
            return 0;
        }
       return n + sum(n-1);
    }
}
