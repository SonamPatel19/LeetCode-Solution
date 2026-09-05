class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int max=-1;
        int[] leftmin=new int[n];
        leftmin[0]=prices[0];
        for(int i=1;i<n;i++){
            leftmin[i]=Math.min(leftmin[i-1],prices[i]);
        }

        for(int i=0;i<n;i++){
            int value=prices[i]-leftmin[i];
            max=Math.max(value,max);
        }
        return max;
}
}