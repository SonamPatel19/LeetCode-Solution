class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        for(int i=0;i<n;i++){
            int value=target-numbers[i];
            //binary search
            int low=i+1;
            int high=n-1;
            while(low<=high){
                int mid=(low+high)/2;
                if(numbers[mid]==value){
                    return new int[]{i+1,mid+1};
                }
                else if(value<numbers[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
        }
        return new int[]{-1,-1};
    }
}