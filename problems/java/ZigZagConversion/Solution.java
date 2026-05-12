package problems.java.ZigZagConversion;

import java.util.Stack;

public class Solution {
    public String convert(String s, int numRows)
    {
        if(numRows ==1 || s.length() <= numRows){
            return s;
        }
        StringBuilder[] rows = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        Stack<Integer> stack = new Stack<>();
        int index = 0;

        while (index < s.length()) {
      
            for (int row = 0;
                 row < numRows && index < s.length();
                 row++) {

                rows[row].append(s.charAt(index++));

                if (row != 0 && row != numRows - 1) {
                    stack.push(row);
                }
            }

            while (!stack.isEmpty() && index < s.length()) {

                int row = stack.pop();

                rows[row].append(s.charAt(index++));
            }
        }

        StringBuilder result = new StringBuilder();

        for (StringBuilder row : rows) {
            result.append(row);
        }


        return result.toString();
    }
    
}
