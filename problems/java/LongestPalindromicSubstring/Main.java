package problems.java.LongestPalindromicSubstring;



public class Main {
    public static void main(String[] args) {
    
        Solution sol = new Solution();
    
        String input = "babad";
    
        String result = sol.longestPalindrome(input);
    
        System.out.println("Entrada: " + input);
        System.out.println("Saída: " + result);
    }
    
}