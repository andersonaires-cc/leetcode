package problems.java.TwoSum;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution twoSum = new Solution();

        // Teste 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = twoSum.twoSum(nums1, target1);

        System.out.println("Teste 1 - Array: " + Arrays.toString(nums1) + 
                         ", Target: " + target1 + 
                         ", Resultado: " + Arrays.toString(result1));

        // Teste 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = twoSum.twoSum(nums2, target2);

        System.out.println("Teste 2 - Array: " + Arrays.toString(nums2) + 
                         ", Target: " + target2 + 
                         ", Resultado: " + Arrays.toString(result2));

        // Teste 3
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = twoSum.twoSum(nums3, target3);

        System.out.println("Teste 3 - Array: " + Arrays.toString(nums3) + 
                         ", Target: " + target3 + 
                         ", Resultado: " + Arrays.toString(result3));
    }
}
