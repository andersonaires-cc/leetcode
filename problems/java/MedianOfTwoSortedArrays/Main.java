package problems.java.MedianOfTwoSortedArrays;

public class Main {
    
    public static void main(String[] args) {
        
        Solution MedianTwoSortedArray = new Solution();

        int[] nums1 = {1,2};
        int[] nums2 = {3,4};

        double result = MedianTwoSortedArray.findMedianSortedArrays(nums1, nums2);

        System.out.println( "Teste 1  = " + result);
    }
}
