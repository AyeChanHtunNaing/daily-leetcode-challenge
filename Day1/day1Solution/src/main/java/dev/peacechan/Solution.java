package dev.peacechan;

import java.util.Arrays;

class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            } else {
                count = 0;
            }
            if (count == 3) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr1 = {2, 6, 4, 1};
        int[] arr2 = {1, 2, 34, 3, 4, 5, 7, 23, 12};
        System.out.println("Input : "+ Arrays.toString(arr1));
        System.out.println("Output : "+ solution.threeConsecutiveOdds(arr1));
        System.out.println("Input : "+ Arrays.toString(arr2));
        System.out.println("Output : "+ solution.threeConsecutiveOdds(arr2));
    }
}
