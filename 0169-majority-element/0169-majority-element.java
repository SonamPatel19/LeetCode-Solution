class Solution {
    public int majorityElement(int[] nums) {
        int freq=0,ans=0;
        for(int i=0;i<nums.length;i++){//o(n)
            if(freq==0){
                ans=nums[i];
            }
            if(ans==nums[i]){
                freq++;
            }
            else{
                freq--;
            }
        }
        return ans;
    }
}