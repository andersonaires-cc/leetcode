package problems.java.LongestSubstringWithoutRepeatingCharacters;

public class Main {
    public static void main(String[] args) {
        
        Solution longestSubstring = new Solution();

        String Input1 = "abcabcbb";
        String Input2 = "bbbbb";
        String Input3 = "pwwkew";

        int result = longestSubstring.lengthOfLongestSubstring(Input1);
        int result2 = longestSubstring.lengthOfLongestSubstring(Input2);
        int result3 = longestSubstring.lengthOfLongestSubstring(Input3);

        System.out.println(result);
        System.out.println(result2);
        System.out.println( result3);

        
    }
}
