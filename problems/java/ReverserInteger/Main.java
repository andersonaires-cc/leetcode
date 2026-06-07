package problems.java.ReverserInteger;

public class Main {
    public static void main(String[] args) {

        Solution reverse = new Solution();

        System.out.println("123 -> " + reverse.reverse(123));
        System.out.println("-123 -> " + reverse.reverse(-123));
        System.out.println("120 -> " + reverse.reverse(120));
        System.out.println("1534236469 -> " + reverse.reverse(1534236469));
    }
}