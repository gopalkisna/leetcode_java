package src.main.java;

import java.util.HashSet;
import java.util.Set;

public class VowelsCountTest {

    public static void main(String[] args) {

        String s = "abciiidef";
        int k = 3;

        Set<Character> vowelsSet = new HashSet<>();

        vowelsSet.add('a');
        vowelsSet.add('e');
        vowelsSet.add('i');
        vowelsSet.add('o');
        vowelsSet.add('u');

        int maxVowelsCount = 0;
        int i = 0;

        while (i < s.length()) {
            int j = i;
            int slide = 0;
            int curWindowVowelsCount = 0;
            while (slide < k && j < s.length()) {
                if (vowelsSet.contains(s.charAt(j))) {
                    curWindowVowelsCount++;
                }
                j++;
                slide++;
            }
            maxVowelsCount = Math.max(maxVowelsCount, curWindowVowelsCount);

            i++;
        }
        System.out.println("Maximum : " + maxVowelsCount);
    }
}
