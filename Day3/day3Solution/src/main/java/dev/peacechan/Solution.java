package dev.peacechan;

import java.util.Arrays;

public class Solution {
    public int minDifference(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length, min = Integer.MAX_VALUE;
        if (n <= 3)
            return 0;
        for (int i = 1; i <= 4; i++) {
            min = Math.min(min, Math.abs(nums[n - i] - nums[4 - i]));
        }
        return min;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {5, 3, 2, 4};
        System.out.println("Input :  " + Arrays.toString(nums1));
        System.out.println("Output :  " + solution.minDifference(nums1));

        int[] nums2 = {1, 5, 0, 10, 14};
        System.out.println("Input :  " + Arrays.toString(nums2));
        System.out.println("Output :  " + solution.minDifference(nums2));

        int[] nums3 = {3, 100, 20};
        System.out.println("Input :  " + Arrays.toString(nums3));
        System.out.println("Output :  " + solution.minDifference(nums3));
    }
}