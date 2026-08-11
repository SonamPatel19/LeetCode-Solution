class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long var=(long)m*k;
        if(var>bloomDay.length) return -1;
        int low=minimum(bloomDay);
        int high=max(bloomDay);
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(bloomDay,m,k,mid)==true){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    static int minimum(int[] bloomDay){
         int min=Integer.MAX_VALUE;
          for(int i=0;i<bloomDay.length;i++ ){
            if(bloomDay[i]<min){
                min=bloomDay[i];
            }
          }
          return min;
    }
    static int max(int[] bloomDay){
         int max=Integer.MIN_VALUE;
          for(int i=0;i<bloomDay.length;i++ ){
            if(bloomDay[i]>max){
                max=bloomDay[i];
            }
          }
          return max;
    }
    static boolean possible(int[] bloomDay,int m, int k ,int mid){
                int totalbloom=0;
                int count=0;
              for(int i=0;i<bloomDay.length;i++){
                if(bloomDay[i]<=mid){
                     count++;
                }
                else {
                         totalbloom+=(count/k);
                        count=0;
                }
            }
            totalbloom+=(count/k);
           return totalbloom >= m;
    }
}