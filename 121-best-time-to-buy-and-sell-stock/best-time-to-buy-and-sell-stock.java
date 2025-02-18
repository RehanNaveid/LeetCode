class Solution {
    public int maxProfit(int[] prices) {
        int min_price=Integer.MAX_VALUE;
        int max_profit=0;
        int profit;
        for(int i=0;i<prices.length;i++){
            min_price=Math.min(min_price,prices[i]);
            profit=prices[i]-min_price;
            max_profit=Math.max(max_profit,profit);
        }
        return max_profit;
    }
}