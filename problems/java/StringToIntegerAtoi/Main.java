package problems.java.StringToIntegerAtoi;

public class Main {
    public static void main(String[] args) {
           Solution solution = new Solution();

        String[] testes = {
            "42",
            "   -42",
            "4193 with words",
            "words and 987",
            "-91283472332",
            "2147483648",
            "+123",
            "000123",
            "   +0 123",
            "",
            "     ",
            "-0012a42"
        };

        for (String teste : testes) {
            System.out.println("Entrada: \"" + teste + "\"");
            System.out.println("Saída: " + solution.myAtoi(teste));
            System.out.println("----------------------------");
        }
    }
    
}
