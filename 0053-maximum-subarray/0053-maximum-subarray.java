class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int sum=0;
        boolean allNegative = true;

        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) {
                allNegative = false;
                break;
            }
        }

        if (allNegative) {
            for (int i = 0; i < n; i++) {
                max = Math.max(max, nums[i]);
            }
            return max;
        }
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(sum<0){
                sum=0;
            }
            max=Math.max(max,sum);
        }
        return max;
    }
}