package leetCode.medium;

import java.lang.Math;

public class MaximumSubarray {
    // T - O(n)
    // S - O(1)
    public int maxSubArray(int[] nums) {
        int currentSum = 0, maxSum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        MaximumSubarray m = new MaximumSubarray();
        System.out.println(m.maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
    }
}