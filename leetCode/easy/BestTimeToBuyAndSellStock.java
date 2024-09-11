package leetCode.easy;

public class BestTimeToBuyAndSellStock {
    // T - O(n)
    // S - O(1)
    public int maxProfitOptimised(int[] prices) {
        int lowestPrice = prices[0];
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] - lowestPrice > maxProfit) {
                maxProfit = prices[i] - lowestPrice;
            }
            if (prices[i] < lowestPrice) {
                lowestPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock b = new BestTimeToBuyAndSellStock();
        System.out.println(b.maxProfitOptimised(new int[] { 7, 1, 5, 3, 6, 4 }));
    }
}
