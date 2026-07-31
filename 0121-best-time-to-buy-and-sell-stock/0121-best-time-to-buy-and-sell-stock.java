class Solution {
    public int maxProfit(int[] prices) {
        int mP = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < mP) {
                mP = prices[i];
            } else {
                int profit = prices[i] - mP;
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        return maxProfit;
    }
}