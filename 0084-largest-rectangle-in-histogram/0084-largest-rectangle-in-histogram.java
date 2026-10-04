class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea=0;
        Stack<Integer>s=new Stack<>();
        int rsh[]=new int[heights.length];
        //right smaller height
        for(int i=heights.length-1;i>=0;i--){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                rsh[i]=heights.length;
            }
            else{
                rsh[i]=s.peek();
            }
            s.push(i);
        }

        s=new Stack<>();
        int[] lsh=new int[heights.length];
        //left smaller height
         for(int i=0;i<heights.length;i++){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                lsh[i]=-1;
            }
            else{
                lsh[i]=s.peek();
            }
            s.push(i);
        }

        //area
        for(int i=0;i<heights.length;i++){
            int length=heights[i];
            int width=rsh[i]-lsh[i]-1;
            int area=length*width;
            maxArea=Math.max(maxArea,area);
        }

        return maxArea;
    }
}