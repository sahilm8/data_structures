package leetCode.easy;

import java.util.HashSet;
import java.util.Arrays;

// T - O(n^2)
// S - O(1)
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    // T - O(n)
    // S - O(n)
    public boolean containsDuplicateOptimised(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }

    // T - O(n log n) (due to sorting)
    // S - O(1)
    public boolean containsDuplicateOptimised2(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate solution = new ContainsDuplicate();
        int[] nums = { 1, 2, 3, 4, 5, 1 };
        System.out.println(solution.containsDuplicateOptimised2(nums));
    }
}
