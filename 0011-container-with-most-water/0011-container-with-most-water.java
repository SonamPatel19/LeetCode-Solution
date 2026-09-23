class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int left=0;
        int right=n-1;
        int area=0;
        while(left<=right){
            int width=right-left;
            min=Math.min(height[left],height[right]);
            area=width*min;
            max=Math.max(area,max);
            if(height[left]<height[right]){
                   left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
}