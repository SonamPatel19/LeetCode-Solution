class Solution {
     static class Row implements Comparable<Row>{
        int soldiers;
        int indx;
        public Row(int soldiers,int indx){
            this.soldiers=soldiers;
            this.indx=indx;
        }

        @Override 
        public int compareTo(Row r2){
            if(this.soldiers== r2.soldiers){
                return this.indx-r2.indx;
            }
            else{
                return this.soldiers-r2.soldiers;
            }
        }
    }
    public int[] kWeakestRows(int[][] mat, int k) {
       PriorityQueue<Row>pq=new PriorityQueue<>();
        for(int i=0;i<mat.length;i++){
            int count=0;
            for(int j=0;j<mat[i].length;j++){
                  count+= mat[i][j]==1?1:0;
            }
            pq.add(new Row(count,i));
        }

        int[] ans=new int[k];

        for(int i=0;i<k;i++){
            ans[i]=pq.remove().indx;
        }
        return ans;
    }
}