class Solution {
    public int splitArray(int[] nums, int k) {
        int n=nums.length;
        int low=Min(nums);
        int high=sum(nums);
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(cansplit(nums,mid,k)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    static int Min(int[] nums){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        return min;
    }
    static int sum(int[] nums){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum;
    }
    static boolean cansplit(int[] nums,int mid,int k){
        int splitarr=1;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>mid) return false;
            if(sum+nums[i]>mid){
                splitarr+=1;
                sum=nums[i];
            }
            else{
                sum+=nums[i];
            }
        }
        if(splitarr>k) {
            return false;
        }
           return true;
    }
}