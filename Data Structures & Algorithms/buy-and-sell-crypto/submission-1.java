class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int maxProfit=0;
        int b=0;
        int s=1;
        while(s<n){
            if(prices[s]>prices[b]){
                maxProfit=Math.max(maxProfit,prices[s]-prices[b]);
            }else{
                b=s;
            }
            s++;
        }
        return maxProfit;
    }
}
