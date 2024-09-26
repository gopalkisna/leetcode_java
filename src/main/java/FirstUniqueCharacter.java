package src.main.java;

import java.util.LinkedHashSet;
import java.util.Set;

public class FirstUniqueCharacter {

    public static void main(String[] args) {

        String str = "abcabc";
        Set<Character> set = new LinkedHashSet<>();

        for(int i=0;i<str.length();i++){
            if(set.contains(str.charAt(i))){
                set.remove(str.charAt(i));
            }else{
                set.add(str.charAt(i));
            }
        }

        for(Character ch:set){
            System.out.println(ch);
            break;
        }


    }
}
