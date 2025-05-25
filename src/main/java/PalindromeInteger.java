package src.main.java;

public class PalindromeInteger {

    public static void main(String[] args) {
        
        int n = 202;
        int n2 = 0;
        int copy = n;
        
        while(n > 0){
            int rem = n % 10;
            n2 = n2 * 10 + rem;
            n = n / 10;
        }

        System.out.println("Palindrome of " + copy +" is " + n2);
        System.out.println("Is this a palindrome : "+ (copy == n2));
    }
}
