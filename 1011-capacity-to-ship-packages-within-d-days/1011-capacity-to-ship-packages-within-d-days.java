class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int low=max(weights);
        int high=CalcSum(weights);
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            int DaysReq=CalcDay(weights,mid);
            if(DaysReq<=days){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    static int max(int[] weights){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<weights.length;i++){
            if(weights[i]>max){
                max=weights[i];
            }
        }
        return max;
    }
    static int CalcSum(int[] weights){
        int sum=0;
        for(int i=0;i<weights.length;i++){
            sum+=weights[i];
        }
        return sum;
    }
    static int CalcDay(int[] weights,int mid){
        int days=1;
        int load=0;
        for(int i=0;i<weights.length;i++){
            if(load+weights[i]>mid){
                days=days+1;
                load=weights[i];
            }
            else{
                load+=weights[i];
            }
        }
        return days;
    }
}