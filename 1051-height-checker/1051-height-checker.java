class Solution {
    public int heightChecker(int[] heights) {
         int n=heights.length;
         int largest=Integer.MIN_VALUE;
         int[] expected=new int[n];
         int count2=0;
         for(int i=0;i<n;i++){
             largest=Math.max(heights[i],largest);
         }
          int[] count=new int[largest+1];
            for(int i=0;i<n;i++){
                count[heights[i]]++;
            }
            int k=0;
            for(int i=0;i<count.length;i++){
                while(count[i]>0){
                expected[k]=i;
                k++;
                count[i]--;
            }
            }
              int j=0;
            for(int i=0;i<n;i++){
                if(heights[i]!=expected[j]){
                    count2++;
                }
                j++;
            }
            return count2;
    }
}