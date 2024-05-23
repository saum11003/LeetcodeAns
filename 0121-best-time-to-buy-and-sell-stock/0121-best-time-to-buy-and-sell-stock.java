class Solution {
    public int maxProfit(int[] prices) {
//         int currentprofit = 0;
//         int maxprofit =0;
            
//             for(int i =0;i<prices.length;i++){
//                 for(int j=i+1;j<prices.length;j++){
//                     currentprofit = prices[j]-prices[i];
//                     maxprofit = Math.max(currentprofit,maxprofit);
// }
//             }
//         return maxprofit;
        
        int profit =0;
        int min= prices[0];
        for(int i=0;i<prices.length;i++){
            int cost = prices[i]-min;
            profit = Math.max(profit,cost);
            min =Math.min(min,prices[i]);
}
        return profit;
        
    }
}