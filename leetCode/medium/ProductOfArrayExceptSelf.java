package leetCode.medium;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    // T - O(n)
    // S - O(1) (auxilary space complexity), O(n) (total space complexity)
    public int[] productExceptSelf(int[] nums) {
        int[] results = new int[nums.length];
        int leftProdcut = 1, rightProduct = 1;
        for (int i = 0; i < nums.length; i++) {
            results[i] = leftProdcut;
            leftProdcut *= nums[i];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            results[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        return results;
    }

    public static void main(String[] args) {
        ProductOfArrayExceptSelf p = new ProductOfArrayExceptSelf();
        System.out.println(Arrays.toString(p.productExceptSelf(new int[] { 1, 2, 3, 4 })));
    }
}
