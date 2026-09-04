class Solution {
    public int trap(int[] height) {
        int n=height.length;
        //leftmax Bound
        int[] LeftBound=new int[height.length];
        LeftBound[0]=height[0];
        for(int i=1;i<n;i++){
            LeftBound[i]=Math.max(LeftBound[i-1],height[i]);
        }
        //rightmax bound
         int[] rightBound=new int[n];
         rightBound[n-1]=height[n-1];
         for(int i=n-2;i>=0;i--){
            rightBound[i]=Math.max(rightBound[i+1],height[i]);
         }
         int trappedwater=0;
        //water level=min(max(LeftBound),max(RightBound))
        for(int i=0;i<n;i++){
        int waterlevel=Math.min(LeftBound[i],rightBound[i]);

        //trappedWater=(water level-height)*width
         trappedwater+=(waterlevel-height[i]);
    }
    return trappedwater;
    }
}