class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int countZero=0;
        int countOne=0;
        int countTwo=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                countZero++;
            }
            else if(nums[i]==1){
                countOne++;
            }
            else{
                countTwo++;
            }
        }

        int i=0;
        while(countZero>0){
            nums[i]=0;
            i++;
            countZero--;
        }
        while(countOne>0){
            nums[i]=1;
            i++;
            countOne--;
        }
        while(countTwo>0){
            nums[i]=2;
            i++;
            countTwo--;
        }
    }
}