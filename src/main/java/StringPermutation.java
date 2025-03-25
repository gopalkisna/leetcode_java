package src.main.java;

public class StringPermutation {

    public static void main(String[] args) {

        String str = "ABC";
        permute(str.toCharArray(), 0);
        System.out.println("Original String "+str); //remains same
    }

    private static void permute(char[] ar, int fi) {

        if(fi == ar.length - 1){
            System.out.println(ar);
        }
        for(int i=fi;i<ar.length;i++){
            swap(ar, i, fi);
            permute(ar, fi+1);
            swap(ar, i, fi);
        }
    }

    private static void swap(char[] ar, int i, int fi) {
        if( i!= fi){
            char temp = ar[i];
            ar[i] = ar[fi];
            ar[fi]=temp;
        }
    }
}
