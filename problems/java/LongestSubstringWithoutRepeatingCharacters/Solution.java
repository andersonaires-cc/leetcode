package problems.java.LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s){

        char[] characteres = s.toCharArray();

        int left = 0;
        int max = 0;

        HashSet<Character> subString = new HashSet<>();

        for(int i = 0; i < characteres.length; i++)
        {
            while(subString.contains(s.charAt(i)))
            {
                subString.remove(s.charAt(left));
                left++;
            }

            subString.add(s.charAt(i));
            max = Math.max(max, i - left +1);
        }

        return max;
    }
    
}