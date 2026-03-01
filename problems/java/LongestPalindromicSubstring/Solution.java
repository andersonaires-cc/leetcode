
package problems.java.LongestPalindromicSubstring;

public class Solution {

    int lo = 0;
    int max = 0;

    public String longestPalindrome(String s){
        
        if(s.length() < 2 )
        {
            return s;
        }
        char[] input = s.toCharArray();        


        for(int i = 0; i < input.length; i++)
        {
            expand(input, i, i);   
            expand(input, i, i + 1);
        }

        return s.substring(lo,lo+max);
    }

    public void expand(char[] s, int j, int k)
    {
        while(j >= 0 && k < s.length && s[j] == s[k]) {
            j--;
            k++;
        }
        if(max < k - j - 1) {
            max = k - j - 1;
            lo = j+1;
        }
    }
     
}