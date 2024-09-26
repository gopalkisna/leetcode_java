package src.main.java;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {


        Set<Character> set = new HashSet<>();
        int l = 0;
        int max = -1;

        for(int r=0;r<s.length();r++){
            if(set.contains(s.charAt(r))){
                set.remove(s.charAt(r));
                l+=1;
            }
            set.add(s.charAt(r));
            int diff = r - l;
            max = Math.max(max, diff);
        }
        return max + 1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.lengthOfLongestSubstring("abcabcbb"));
    }
}