class Solution {
     static class point implements Comparable<point>{
        int x;
        int y;
        int distsq;
        int indx;
        public  point(int x,int y,int distsq,int indx){
               this.x=x;
               this.y=y;
               this.distsq=distsq;
               this.indx=indx;
        }

        @Override
        public int compareTo(point p2){
            return this.distsq-p2.distsq;
        }
     } 
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<point>pq=new PriorityQueue<>();
        for(int i=0;i<points.length;i++){
        int disq=points[i][0]*points[i][0] +points[i][1]*points[i][1];
         pq.add(new point(points[i][0],points[i][1],disq,i));
        }

        int ans[][]=new int[k][2];
        for(int i=0;i<k;i++){
            point p=pq.poll();
            ans[i][0]=p.x;
            ans[i][1]=p.y;
        }
        return ans;
    }
}