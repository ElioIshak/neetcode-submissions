class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxprofit = 0;

        for(int i=0; i<n-1; i++){
            int profit = 0;
            int j = i+1;

            while(j < n && prices[j] - prices[i] > 0){
                profit = Math.max(profit, prices[j] - prices[i]);
                j++;
            }

            maxprofit = Math.max(profit, maxprofit);
        }

        return maxprofit;
    }
}
