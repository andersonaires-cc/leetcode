package problems.java.StringToIntegerAtoi;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public int myAtoi(String s){

       Queue<Character> fila = new LinkedList<>();
        int i = 0;
        int n = s.length();
        int sign = 1;

        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        if (i == n) {
            return 0;
        }

         if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }

        while (i < n && Character.isDigit(s.charAt(i))) {
            fila.offer(s.charAt(i));
            i++;
        }

         int result = 0;

        while (!fila.isEmpty()) {

            int digit = fila.poll() - '0';

            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
        }

        return result * sign;
    }
    
}
