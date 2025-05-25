package src.main.java;

public class RecursiveFibonacci {

    public static void main(String[] args) {
        int n = 6;
        int[] dp = new int[n+1];
        System.out.println(fib(n, dp));
        System.out.println(fib(n));

    }

    private static int fib(int n, int[] dp) {

        if(n <= 1) return n;
        if(dp[n] != 0) return dp[n];
        return dp[n] = fib(n-1, dp) + fib(n-2, dp);
    }


    private static int fib(int n) {

        if(n <= 1) return n;
        return fib(n-1) + fib(n-2);
    }
}
