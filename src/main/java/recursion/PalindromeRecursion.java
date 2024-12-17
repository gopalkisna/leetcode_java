package src.main.java.recursion;

public class PalindromeRecursion {

    public static void main(String[] args) {


        String str = "MADSM";

        System.out.println(checkForPalindrome(str, 0, str.length()-1));
    }

    private static Boolean checkForPalindrome(String str, int l, int r) {

        if(l >= r){
            return true;
        }

        if(str.charAt(l) == str.charAt(r)){
            return checkForPalindrome(str, l+1, r-1);
        }else{
            return false;
        }
    }
}
