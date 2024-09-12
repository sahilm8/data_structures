package leetCode.easy;

import java.util.HashMap;

public class TwoSum {
    // T - O(n^2)
    // S - O(1)
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("Invalid args");
    }

    // T - O(n)
    // S - O(n)
    public int[] twoSumOptimised(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] nums = { 1, 2, 3, 4, 5 };
        int target = 9;
        int[] result = solution.twoSumOptimised(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}