class Solution {
    public int maxProfit(int[] prices) {
        int b=0,p=0,s=0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i]<prices[i+1]){
                b=prices[i];
                s=prices[i+1];
                p=p+s-b;
            }
        }
        return p;
    }
}
