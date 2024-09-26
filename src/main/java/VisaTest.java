package src.main.java;

import java.util.HashSet;
import java.util.Set;

public class VisaTest {

    public static void main(String[] args) {

        String input = "Gopala";
        Set<Character> set = new HashSet<>();

        for(char ch:input.toCharArray()){
            if(set.contains(ch)){
                System.out.println("First Duplicate Element : "+ch);
                return;
            }else{
                set.add(ch);
            }

        }

        System.out.println("No Duplicate Element");
    }
}
