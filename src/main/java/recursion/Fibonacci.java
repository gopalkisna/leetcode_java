package src.main.java.recursion;

public class Fibonacci {

    public static void main(String[] args) {

        int n = 5;

        System.out.println(printNthFibonacci(n, 0,0, 1, 0));
    }

    private static int printNthFibonacci(int n, int counter, int l, int r, int sum) {

        if(n == 0){
            return l;
        }

        if(n == 1){
            return r;
        }

        sum = l + r;
        return 0;
                //printNthFibonacci(n, r, sum, sum);

    }
}
