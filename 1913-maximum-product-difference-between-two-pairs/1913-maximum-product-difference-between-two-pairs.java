class Solution {
    public int maxProductDifference(int[] nums) {
        int n=nums.length;
        int prod=1;
        Arrays.sort(nums);
        int a=nums[0];
        int b=nums[1];
        int c=nums[n-1];
        int d=nums[n-2];
        prod=(c*d)-(a*b);
        return prod;
    }
}