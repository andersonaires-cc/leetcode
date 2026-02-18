package problems.java.MedianOfTwoSortedArrays;

import java.util.Arrays;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];

        System.arraycopy(nums1, 0, result, 0, nums1.length);
        System.arraycopy(nums2, 0, result, nums1.length, nums2.length);
        
        Arrays.sort(result);

        int n = result.length;
        if(n % 2 == 0)
        {
            return (double) (result[n/2-1] + result[n/2])/2;
        }
        else
        {
            return (double) result[n/2];
        }
        
    }
}
