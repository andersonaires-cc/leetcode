package problems.java.ZigZagConversion;

public class Main {
     public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(
                solution.convert("PAYPALISHIRING", 3)
        );

        System.out.println(
                solution.convert("PAYPALISHIRING", 4)
        );

        System.out.println(
                solution.convert("ABCD", 2)
        );
    }
}
