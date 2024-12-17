package src.main.java.recursion;

public class RecursionTest {

    public static void main(String[] args) {

        int n=5;
        callFunction(n);
    }

    private static int callFunction(int n) {

        if(n == 0){
            return 0;
        }

        System.out.println(n);
        return callFunction(n-1);
    }
}
