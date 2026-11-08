class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int max = 0;
        int min = prices[0];
        
        for (int i=1; i<n; i++) {

            if (min > prices[i])
                min = prices[i];

            max = Math.max(max, prices[i] - min);
        }

        return max;
    }
}
