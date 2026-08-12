class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        int low=1;
        int high=max(nums);
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(CalcSum(nums,mid)<=threshold){
                 ans=mid;
                 high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return ans;
}
      static int max(int[] nums){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return max;
      }
      static int CalcSum(int[] nums,int mid){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=(nums[i]+mid-1)/mid;
        }
        return sum;
      }
}