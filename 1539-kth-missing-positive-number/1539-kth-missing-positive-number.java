class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            int missing=arr[mid]-(mid+1);
            if(missing>=k){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low+k;
    }
    // static int max(int[] arr){
    //     int max=Integer.MIN_VALUE;
    //     for(int i=0;i<arr.length;i++){
    //         if(max<arr[i]){
    //             max=arr[i];
    //         }
    //     }
    //     return max;
    // }
}